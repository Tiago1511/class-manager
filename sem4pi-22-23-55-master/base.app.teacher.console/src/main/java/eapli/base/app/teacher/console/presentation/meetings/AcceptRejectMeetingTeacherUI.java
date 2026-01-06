package eapli.base.app.teacher.console.presentation.meetings;

import eapli.base.app.backoffice.console.presentation.meetings.CancelMeetingUI;
import eapli.base.app.backoffice.console.presentation.meetings.MeetingsPrinter;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.application.AceptRejectMeetingController;
import eapli.base.meetingsManagement.domain.InviteStatus;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AcceptRejectMeetingTeacherUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(AcceptRejectMeetingTeacherUI.class);

    private final AceptRejectMeetingController theController = new AceptRejectMeetingController();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();
    private final UserRepository systemUser = PersistenceContext
            .repositories().users(txCtx);

    @Override
    protected boolean doShow() {
        final SystemUser systemUser = (authz.session().get().authenticatedUser());
        final Iterable<Meetings> meetings = theController.meeting(systemUser);

        final SelectWidget<Meetings> selector = new SelectWidget<>("Meetings:", meetings, new MeetingsPrinter());

        selector.show();


        if (selector.selectedOption() == 0) {
            System.out.println("Canceled operation");
            return false;
        }


        final Meetings theMeetings = selector.selectedElement();

        if (theMeetings == null) {
            return false;
        }

        InviteStatus inviteStatus;
        inviteStatus = aceptReject();

        if (inviteStatus == null) {
            System.out.println("Canceled operation");
            return false;
        }

        try{

            this.theController.aceptRejectMeeting(theMeetings, inviteStatus ,systemUser);
        } catch (@SuppressWarnings("unused") final ConcurrencyException ex) {
            System.out.println(
                    "WARNING: Unable to cancel meeting because it has been changed by another user");
        } catch (final IntegrityViolationException ex) {
            LOGGER.error("Error performing the operation", ex);
            System.out.println(
                    "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
        }

        System.out.println("Meeting "+ inviteStatus +" successfully");

        return false;
    }

    private InviteStatus aceptReject() {
        int option;
        do {
            option = optionsStatus();
        }while (option != 1 && option != 2 && option != 0);
        switch (option) {
            case 1:
                return InviteStatus.ACCEPT;
            case 2:
                return InviteStatus.REJECT;
            case 0:
                return null;
        }
        return null;
    }

    private Integer optionsStatus() {
        System.out.println("=========================");
        System.out.println("Choose the status of the meeting:");
        System.out.println("1. Accept");
        System.out.println("2. Reject");
        System.out.println("0. Exit");
        final Integer option = Console.readInteger("Enter option:");
        return option;
    }



    @Override
    public String headline() {
        return "Acept/Reject Meetings";
    }
}
