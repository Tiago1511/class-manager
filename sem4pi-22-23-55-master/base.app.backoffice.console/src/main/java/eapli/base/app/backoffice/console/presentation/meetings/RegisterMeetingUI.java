package eapli.base.app.backoffice.console.presentation.meetings;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.application.RegisterMeetingController;
import eapli.base.meetingsManagement.domain.Invite;
import eapli.base.meetingsManagement.domain.InviteStatus;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class RegisterMeetingUI extends AbstractUI {

    private final RegisterMeetingController theController = new RegisterMeetingController();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();
    private final UserRepository systemUser = PersistenceContext
            .repositories().users(txCtx);

    private Set<Invite> invite = new HashSet<>();
    @Override
    protected boolean doShow() {

        final Boolean cancelled = false;
        final SystemUser systemUser = (authz.session().get().authenticatedUser());
        final Calendar date = Console.readCalendar("Insert Meeting Date: (dd-MM-yyyy)");
        final String time = Console.readLine("Insert Meeting Start Time: (HH:mm)");
        LocalTime startTime = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            startTime = LocalTime.parse(time, formatter);
        } catch (Exception e) {
            System.out.println("Invalid Time Format");
            return false;
        }

        final Integer input = Console.readInteger("Insert Meeting Duration in Seconds :");
        LocalTime endTime = startTime.plusSeconds(input);

        insertInvite();

        theController.registerMeeting(date, startTime, endTime, invite, cancelled, systemUser);
        System.out.println("Meeting Registered Successfully");
        return false;
    }

    private void insertInvite() {

        InviteStatus inviteStatus = InviteStatus.PENDING;

        do {
            SystemUser systemUsers = null;
            final String participant = Console.readLine("Insert Participant ID: ");
            try {
                systemUsers = systemUser.ofIdentity(Username.valueOf(participant)).get();
            } catch (Exception e) {
                System.out.println("Invalid Participant ID");
            }
            if (systemUsers != null)
                invite.add(new Invite(systemUsers, inviteStatus));
        }while (Console.readLine("Do You Want To Add A New Participant? (y/n)").equalsIgnoreCase("y"));

    }

    @Override
    public String headline() {
        return "Register Meeting";
    }
}
