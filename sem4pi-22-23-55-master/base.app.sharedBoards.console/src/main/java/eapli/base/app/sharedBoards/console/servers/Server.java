package eapli.base.app.sharedBoards.console.servers;


import eapli.base.app.sharedBoards.console.cliente.Cliente;
import eapli.base.boardManagement.application.PostitController;
import eapli.framework.io.util.Console;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


import eapli.base.boardManagement.application.AuthenticationController;

public class Server {

    private final static int PORT = 3481;
    static final String TRUSTED_STORE = "backoffice_J.jks";
    static final String KEYSTORE_PASS = "scomplapr";

    public static void main(String[] args) throws Exception {
// The server's socket
        SSLServerSocket sock = null;

// The client's socket
        Socket cliSock;

// Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

// Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore",TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

//Server Port
        try {
            sock = (SSLServerSocket) sslF.createServerSocket(PORT);
            sock.setNeedClientAuth(true);
            System.out.println(sock.getInetAddress());
        } catch(IOException ex) {
            ex.printStackTrace();
            System.out.println("Local port number not available.");
            System.exit(1);
        }

        System.out.println("OPERATIONAL");
        while (true) {
            cliSock = sock.accept();
            new Thread(new TcpSrvAcceptRequestsThread(cliSock)).start();
        }
    }
}

class TcpSrvAcceptRequestsThread implements Runnable {
    private Socket socket;
    private DataOutputStream sOut;
    private DataInputStream sIn;

//private SystemUser user;

    private AuthenticationController ctrl = new AuthenticationController();

    public TcpSrvAcceptRequestsThread(Socket cli_s) {
        socket = cli_s;

    }

    public void run() {
        InetAddress clientIP;

        clientIP = socket.getInetAddress();
        System.out.println("New client connection from " + clientIP.getHostAddress() +
                ", port number " + socket.getPort());

        try {
            sOut = new DataOutputStream(socket.getOutputStream());
            sIn = new DataInputStream(socket.getInputStream());

            byte version;
            byte code;
            byte D_LENGTH_1;
            byte D_LENGTH_2;
            int cont =1;

            byte codeSent;
            do {
                cont ++;
                version = sIn.readByte();
                code = sIn.readByte();
                switch (code) {
                    case 0:
                        codeSent = 2;
                        sOut.write(codeSent);
                        System.out.printf("Sent code: %s \n", codeSent);
                        break;

                    case 1:
                        codeSent = 2;
                        sOut.write(codeSent);
                        System.out.printf("Sent code: %s \n", codeSent);
                        System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + socket.getPort() +
                                " disconnected");
                        socket.close();
                        break;

                    case 3:
                        D_LENGTH_1 = sIn.readByte();
                        D_LENGTH_2 = sIn.readByte();
                        int dataSize = D_LENGTH_1 + D_LENGTH_2 * 256;

                        byte[] dataReceived = new byte[dataSize];
                        for (int i = 0; i < dataSize; i++) {
                            dataReceived[i] = sIn.readByte();
                        }
                        String id = new String(dataReceived);

                        String ip = Console.readLine("Please, a server ip");
                        Cliente sendRequests = new Cliente(new String[]{ip}, (byte) 3, id);

                        sOut.writeByte(1);
                        sOut.writeByte(4);
                        sOut.writeByte(0);
                        sOut.writeByte(0);

                        break;


                    case 4:
                        D_LENGTH_1 = sIn.readByte();
                        D_LENGTH_2 = sIn.readByte();
                        int dataLength = D_LENGTH_1 + 256 * D_LENGTH_2;
                        byte[] stringReceived = new byte[dataLength];
                        for (int i = 0; i < dataLength; i++) {
                            stringReceived[i] = sIn.readByte();
                        }
                        String Info = new String(stringReceived);
                        String[] info = Info.split(";");
                        String username = info[0];
                        String password = info[1];

                        ctrl.verifyLogin(username);

                        if (password != null) {
                            System.out.println("Received code: " + code);
                            System.out.println("Received version: " + version);
                            sOut.write((byte)1);
                            sOut.write((byte)2);
                        }
                        else {
                            System.out.println("Received code: " + code);
                            System.out.println("Received version: " + version);
                            System.out.println("Received username: " + username);
                            sOut.write((byte)1);
                            sOut.write((byte)3);
                            sOut.write((byte)0);
                            sOut.write((byte)0);
                        }

                        break;

                    case 6:
                        System.out.println("Received code: " + code);
                        System.out.println("Received version: " + version);

                        D_LENGTH_1 = sIn.readByte();
                        D_LENGTH_2 = sIn.readByte();
                        int dataLength2 = D_LENGTH_1 + 256 * D_LENGTH_2;
                        byte[] stringReceived2 = new byte[dataLength2];
                        for (int i = 0; i < dataLength2; i++) {
                            stringReceived2[i] = sIn.readByte();
                        }
                        String Info2 = new String(stringReceived2);
                        String[] info2 = Info2.split(";");
                        String title = info2[0];
                        Integer id2 = Integer.valueOf(info2[1]);
                        String content = info2[2];
                        Integer linha = Integer.valueOf(info2[3]);
                        Integer coluna = Integer.valueOf(info2[4]);


                        PostitController ctrl2 = new PostitController();
                        ctrl2.createPostit(title, id2, content, linha, coluna);

                }
            }while (cont != 100);

            System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + socket.getPort() +
                    " disconnected");
            socket.close();
        } catch (IOException ex) {
            System.out.println("IOException");
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

/*public SystemUser verifyLogin(String username) {

if (repo.findByActive(true).iterator().hasNext()) {
while (repo.findByActive(true).iterator().hasNext()) {
SystemUser user = repo.findByActive(true).iterator().next();
if (user.identity().toString().equals(username)) {
return user;
}
}
}
return null;
}*/
}