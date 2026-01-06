package eapli.base.app.backoffice.console.presentation.meetings;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.application.ScheduleMeetingController;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ScheduleMeetingUI extends AbstractUI {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleMeetingUI.class);

    private final ScheduleMeetingController meetingController = new ScheduleMeetingController();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();

    private final UserRepository systemUser = PersistenceContext
            .repositories().users(txCtx);

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    protected boolean doShow() {

        final Calendar date = Console.readCalendar("Insert Meeting Date: (dd-MM-yyyy)");
        final String duration = Console.readLine("Insert Meeting Duration: ");
        List<SystemUser> participants = new ArrayList<>();
        participants.add(authz.session().get().authenticatedUser());
        String addParticipant = Console.readLine("Do You Want To Add A New Participant? (y/n)");
        while (addParticipant.equalsIgnoreCase("y")){
            final String participant = Console.readLine("Insert Participant ID: ");
            participants.add(systemUser.ofIdentity(Username.valueOf(participant)).get());
            addParticipant = Console.readLine("Do You Want To Add A New Participant? (y/n)");
            if (addParticipant.equalsIgnoreCase("n")) break;
        }


        try {
            this.meetingController.scheduleMeeting(participants, date, duration);
            System.out.println("Meeting Scheduled Successfully");
        } catch (final IntegrityViolationException | ConcurrencyException e) {
            LOGGER.error("Occurred an error during the operation", e);
            System.out.println("Occurred an error in the application");
        }
        return true;
    }

    @Override
    public String headline() {
        return "Schedule meeting";
    }
}
