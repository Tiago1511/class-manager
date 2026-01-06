package eapli.base.app.other.console.presentation.meetings;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.application.CancelMeetingController;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CancelMeetingStudentUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(CancelMeetingStudentUI.class);

    private final CancelMeetingController theController = new CancelMeetingController();

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
            return false;
        }


        final Meetings theMeetings = selector.selectedElement();

        if (theMeetings == null) {
            return false;
        }

        try{

            this.theController.cancelMeeting(theMeetings);
        } catch (@SuppressWarnings("unused") final ConcurrencyException ex) {
            System.out.println(
                    "WARNING: Unable to cancel meeting because it has been changed by another user");
        } catch (final IntegrityViolationException ex) {
            LOGGER.error("Error performing the operation", ex);
            System.out.println(
                    "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
        }

        System.out.println("Meeting canceled successfully");

        return false;
    }

    @Override
    public String headline() {
        return "Cancel Meetings";
    }
}
