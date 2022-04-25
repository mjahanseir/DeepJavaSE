package Network.Review.C0408;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            //////////////////////////////////// Step 1-  Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);
            /// Start listening on port .... program waits here
            //////////////////////////////////// Step 2-  Listen for a connection request
            Socket socket = serverSocket.accept();

            ///////////////////////////////////   STEP 4 -  Create data input and output streams
            DataInputStream inFromClient = new DataInputStream( socket.getInputStream());
            DataOutputStream outToClient = new DataOutputStream(  socket.getOutputStream());

            outToClient.writeUTF("Thanks");

            String data= inFromClient.readUTF();

            System.out.println(data);

            outToClient.writeUTF("Thanks");
            outToClient.writeUTF(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
