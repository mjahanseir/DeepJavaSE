package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class intro1 {
    public static void main(String[] args) {

    }
}

class Server{
    int port=8000;
    ServerSocket server = new ServerSocket(port);
    Socket socket= server.accept();
    DataInputStream in = new DataInputStream(
            socket.getInputStream());
    DataOutputStream out = new DataOutputStream(
            socket.getOutputStream());

    Server() throws IOException {
    }

}

class Client{
    int port=8000;
    String host= "localhost";
    Socket socket= new Socket(host,port);
    DataInputStream in = new DataInputStream(
            socket.getInputStream());
    DataOutputStream out = new DataOutputStream(
            socket.getOutputStream());


    Client() throws IOException {
    }
}