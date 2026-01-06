package eapli.base.app.sharedBoards.console;


import eapli.base.app.common.console.presentation.authz.LoginAction;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import eapli.framework.io.util.Console;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class sharedBoardApp {

    private sharedBoardApp() {
    }


    public static void main(final String[] args) throws IOException {
        System.out.println("=====================================");
        System.out.println("Base POS");
        System.out.println("(C) 2016, 2017, 2018");
        System.out.println("=====================================");

        /*AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        // login and go to main menu
        if (new LoginAction(BaseRoles.TEACHER).execute()) {

        } else if (new LoginAction(BaseRoles.MANAGER).execute()) {

        }
        else if (new LoginAction(BaseRoles.STUDENT).execute()) {

        }
        else if (new LoginAction(BaseRoles.ADMIN).execute()) {

        }
        else if (new LoginAction(BaseRoles.POWER_USER).execute()) {

        }*/

        // exiting the application, closing all threads


        /*Client client = new Client();
        final String ip = Console.readLine("IP: ");
        final String username = Console.readLine("Username: ");
        final String password = Console.readLine("Password: ");
        client.main(new String[]{ip, username, password});*/

    }
}
