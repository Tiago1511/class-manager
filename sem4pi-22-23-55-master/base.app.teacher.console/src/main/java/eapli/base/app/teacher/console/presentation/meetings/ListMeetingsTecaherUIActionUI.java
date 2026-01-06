package eapli.base.app.teacher.console.presentation.meetings;


import eapli.base.app.backoffice.console.presentation.meetings.MeetingsPrinter;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.application.ListMeetingController;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

public class ListMeetingsTecaherUIActionUI extends AbstractUI {
    private final ListMeetingController theController = new ListMeetingController();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();
    private final UserRepository systemUser = PersistenceContext
            .repositories().users(txCtx);

    @Override
    protected boolean doShow() {
        final SystemUser systemUser = (authz.session().get().authenticatedUser());
        /*try {
            Iterable<Meetings> meetings = controller.listMeetings(systemUser);
        } catch (Exception e) {
            System.out.println("Error listing meetings");
        }*/

        Integer option = choose();

        if(option == 0){
            return false;
        }
        if (option == 1) {
            listMeetingsCreated(systemUser);
        }
        else if (option == 2) {
            listMeetingsGuest(systemUser);
        }


        return false;
    }

    private Integer choose(){
        Integer option;
        do {
            System.out.println("Choose a meeting to list");
            System.out.println("1 - List meetings created by me");
            System.out.println("2 - List meetings where I am a guest");
            System.out.println("0 - Cancel");
            option = Console.readInteger("Choose an option");
        }while (option != 0 && option != 1 && option != 2);
        return option;
    }

    private boolean listMeetingsCreated(SystemUser systemUser){
        final Iterable<Meetings> meetings = theController.meeting(systemUser);

        final SelectWidget<Meetings> selector = new SelectWidget<>("Meetings:", meetings, new eapli.base.app.backoffice.console.presentation.meetings.MeetingsPrinter());

        selector.show();
        if (selector.selectedOption() == 0) {
            System.out.println("Canceled operation");
            return false;
        }


        final Meetings theMeetings = selector.selectedElement();

        if (theMeetings == null) {
            return false;
        }

        try {
            theController.listMeetings(theMeetings);
        }catch (Exception e){
            System.out.println("Error listing meetings");
        }

        return true;
    }

    private boolean listMeetingsGuest(SystemUser systemUser){
        final Iterable<Meetings> meetings = theController.meetings(systemUser);

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

        try {
            theController.listMeetings(theMeetings);
        }catch (Exception e){
            System.out.println("Error listing meetings");
        }

        return true;
    }

    @Override
    public String headline() {
        return "List Meetings";
    }
}
