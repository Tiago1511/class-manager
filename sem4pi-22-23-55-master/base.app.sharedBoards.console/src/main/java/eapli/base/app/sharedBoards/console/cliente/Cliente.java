package eapli.base.app.sharedBoards.console.cliente;


import eapli.base.app.backoffice.console.presentation.boards.CreatePostitTCPUI;
import eapli.framework.actions.Action;
import eapli.framework.io.util.Console;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Cliente {
    static SSLSocket sock;
    private InetAddress serverIP;
    private DataOutputStream sOut;
    private DataInputStream sIn;
    private static int SERVER_PORT = 3481;

    static final String KEYSTORE_PASS = "scomplapr";

    private Boolean auth = false;

    public Cliente(String[] args, byte code, int port, String id) throws Exception {
        SERVER_PORT = port;
        new Cliente(args, code, id);
    }

    public Cliente(String[] args, byte code, String id) throws Exception {
        if (args.length != 1) {
            System.out.println("Server IPv4/IPv6 address or DNS name is required as argument");
            System.exit(1);
        }

        String certificate =  "agv_manager_J";//Console.readLine("Type the certificate's name");

        // Trust these certificates provided by servers
        System.setProperty("javax.net.ssl.trustStore", certificate + ".jks");
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);

        // Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", certificate + ".jks");
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);

        SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            serverIP = InetAddress.getByName(args[0]);
        } catch (UnknownHostException ex) {
            System.out.println("Invalid server specified: " + args[0]);
            System.exit(1);
        }

        try {
            sock = (SSLSocket) sf.createSocket(serverIP, SERVER_PORT);
        } catch (IOException ex) {
            System.out.println("Failed to connect to: " + args[0] + ":" + SERVER_PORT);
            System.out.println("Application aborted.");
            return;
        }

        try{
            sock.startHandshake();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Connected to: " + args[0] + ":" + SERVER_PORT);

        try {
            sIn = new DataInputStream(sock.getInputStream());
            sOut = new DataOutputStream(sock.getOutputStream());

        } catch (IOException e) {
            System.out.println("Could not open data stream.");
            System.exit(1);

        }
        try{
            autentication(code,id);
        }catch (Exception ignored){

        }
    }

    private void autentication(byte code, String id) throws IOException {

        byte version = (byte) Integer.parseInt("1");
        byte D_LENGTH_1 = (byte) Integer.parseInt("0");
        byte D_LENGTH_2 = (byte) Integer.parseInt("0");
        int agvIdNum;

        byte codeReceived = -1;

        switch (code){
            case 4:
                byte[] InfoInBytes = id.getBytes();
                sOut.write(version);
                sOut.write(code);
                sOut.write(InfoInBytes.length % 256);
                sOut.write(InfoInBytes.length / 256);

                for (byte b : InfoInBytes) {
                    sOut.write(b);
                }
        }

        version = sIn.readByte();
        code = sIn.readByte();

        if (code == 2) {
            auth = true;
        }

        if (auth) {
            System.out.println("Autentication successful!");
            menuPostAutentication();
        } else {
            System.out.println("Autentication failed!");
            System.exit(1);
        }
    }

    private void menuPostAutentication() {
        System.out.println("1 - Crete Post-It");
        System.out.println("2 - Update Post-It");
        System.out.println("3 - Undo Post-It");
        System.out.println("0 - Disconnect");

        int option = Console.readInteger("Option: ");
        switch (option) {
            case 1:
                try {
                    sendRequest((byte) 6, "");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    sendRequest((byte) 3, "asd");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 0:
                try {
                    sendRequest((byte) 1, "");
                    byte code = sIn.readByte();
                    if (code == 2) {
                        System.out.println("Disconnected!");
                        sock.close();
                        System.exit(1);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public void sendRequest(byte code, String id) throws IOException {

        byte version = (byte) Integer.parseInt("1");
        byte D_LENGTH_1 = (byte) Integer.parseInt("0");
        byte D_LENGTH_2 = (byte) Integer.parseInt("0");
        int agvIdNum;

        byte codeReceived = -1;

        do {

            switch (code) {
                case 0: //COMMTEST

                    sOut.write(version);
                    sOut.write(code);
                    do {
                        codeReceived = (byte) sIn.read();
                    } while (codeReceived == -1);
                    System.out.printf("Received code from server: %s.\n", codeReceived);
                    break;

                case 1: //DISCONN

                    sOut.write(version);
                    sOut.write(code);
                    do {
                        codeReceived = (byte) sIn.read();
                    } while (codeReceived == -1);
                    System.out.printf("Received code from server: %s. Disconnecting!\n", codeReceived);
                    break;

                case 2: //GET_INFO

                    sOut.write(version);
                    sOut.write(code);
                    do {
                        codeReceived = (byte) sIn.read();
                    } while (codeReceived == -1);
                    System.out.printf("Received code from server: %s.\n", codeReceived);
                    break;

                case 3: //SEND_REQUEST

                    System.out.println("Connection to: " + id);
                    D_LENGTH_1 = (byte) (id.length() % 256);
                    D_LENGTH_2 = (byte) (id.length() / 256);
                    sOut.write(version);
                    sOut.write(code);
                    sOut.write(D_LENGTH_1);
                    sOut.write(D_LENGTH_2);
                    byte[] stringInBytes = id.getBytes();
                    for (byte b : stringInBytes) {
                        sOut.write(b);
                    }

                case 5:

                    sOut.write(version);
                    sOut.write(code);
                    sOut.write(1);

                case 6:

                    sOut.write(version);
                    sOut.write(code);
                    CreatePostitTCPUI createPostitTCPUI= new CreatePostitTCPUI();

                    createPostitTCPUI.run();

                    String Info[] = createPostitTCPUI.getPostitInfo();
                    String title = Info[0];
                    String id1 = Info[1];
                    String content = Info[2];
                    String linha = Info[3];
                    String coluna = Info[4];

                    String InfoInBytes = title +";"+ id1 +";" +content+ ";"+ linha +";" + coluna;

                    D_LENGTH_1 = (byte) (InfoInBytes.length() % 256);
                    D_LENGTH_2 = (byte) (InfoInBytes.length() / 256);
                    sOut.write(version);
                    sOut.write(code);
                    sOut.write(D_LENGTH_1);
                    sOut.write(D_LENGTH_2);
                    byte[] stringInBytes2 = InfoInBytes.getBytes();
                    for (byte b : stringInBytes2) {
                        sOut.write(b);
                    }

                    case 7:
                        sOut.write(version);
                        sOut.write(code);
                        new CreatePostitTCPUI().run();

            }

        }while (codeReceived != 1000);

        sock.close();
    }

}