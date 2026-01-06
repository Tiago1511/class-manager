package eapli.base.app.teacher.console;

import eapli.base.app.common.console.presentation.authz.LoginAction;
import eapli.base.app.teacher.console.presentation.MainMenu;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;

/**
 * Based  on base.app.other.console\src\main\java\eapli\base\app\other\console\OtherApp.java
 */
@SuppressWarnings("squid:S106")
public class TeacherApp {
    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private TeacherApp() {
    }

        public static void main(final String[] args) {
            System.out.println("=====================================");
            System.out.println("Base POS");
            System.out.println("(C) 2016, 2017, 2018");
            System.out.println("=====================================");

            AuthzRegistry.configure(PersistenceContext.repositories().users(),
                    new BasePasswordPolicy(), new PlainTextEncoder());

            // login and go to main menu
            if (new LoginAction(BaseRoles.TEACHER).execute()) {
                final MainMenu menu = new MainMenu();
                menu.mainLoop();
            }

            // exiting the application, closing all threads
            System.exit(0);
        }
}
