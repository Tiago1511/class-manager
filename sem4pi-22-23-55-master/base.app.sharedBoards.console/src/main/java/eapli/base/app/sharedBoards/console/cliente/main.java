package eapli.base.app.sharedBoards.console.cliente;

import eapli.base.app.sharedBoards.console.Utils;
import eapli.framework.io.util.Console;

import java.io.IOException;
import java.util.Properties;

public class main {

    private String ip = null;
    private String id;

    static Cliente client;


    public static void main(String[] args) {
        main ui = new main();
        ui.start();
    }

    public void start() {
        if (ip == null) {
            ip = Console.readLine("Server IP: ");
        }
        Properties properties;
        try {
            properties = Utils.getProp();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        String userName = Console.readLine("Username: ");
        String password = Console.readLine("Password: ");
        int port = Integer.parseInt(properties.getProperty("prop.serever.port"));
        System.out.println(port);
        id = userName + ";" + password;
        try {
            client = new Cliente(new String[]{ip},(byte) 4 ,port, id);
            // Main UI loop
           /* boolean running = true;
            while (running) {
                System.out.println("\n==== Menu ====");
                System.out.println("1. Send Request");
                System.out.println("2. Communication Test");
                System.out.println("3. Disconnect");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                Integer scanner = Console.readInteger("Choose option: ");

                switch (scanner) {
                    case 1:
                        sendRequest();
                        break;
                    case 2:
                        communicationTest();
                        break;
                    case 3:
                        disconnect();
                        running = false;
                        break;
                    case 0:
                        disconnect();
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }*/
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    /*private void sendRequest() {
        String requestId = Console.readLine("Request ID: ");

        try {
            client.sendRequest((byte)SEND_REQUEST_CODE, requestId);
        } catch (Exception e) {
            System.out.println("Error sending request: " + e.getMessage());
        }
    }

    private void communicationTest() {
        try {
            client.sendRequest((byte)COMMTEST_CODE, "");
        } catch (Exception e) {
            System.out.println("Error sending communication test request: " + e.getMessage());
        }
    }

    private void disconnect() {
        try {
            client.sendRequest((byte)DISCONN_CODE, "");
        } catch (Exception e) {
            System.out.println("Error sending disconnect request: " + e.getMessage());
        }
    }*/

}

