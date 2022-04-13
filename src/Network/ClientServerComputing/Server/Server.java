package Network.ClientServerComputing.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {

            //The Server class creates a ServerSocket and attaches it to port 8000
            ServerSocket serverSocket = new ServerSocket(8000); //create server socket

            //The server then starts to listen for connection requests, using the following statement
            Socket socket= serverSocket.accept(); //listen for connection

            DataInputStream dataInputStream  =  new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("thanks from server");
            String data= dataInputStream.readUTF();

            System.out.println(data);

            dataOutputStream.writeUTF("Thanks");
            dataOutputStream.writeUTF(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        /*
The server waits until the client requests a connection. After it is connected, the server
reads the radius from the client through an input stream, computes the area, and sends the
result to the client through an output stream. The ServerSocket accept() method takes
time to execute. It is not appropriate to run this method in the JavaFX application thread.
So, we place it in a separate thread (lines 23–59). The statements for updating GUI needs
to run from the JavaFX application thread using the Platform.runLater method (lines
27–28, 49–53).
         */

}
