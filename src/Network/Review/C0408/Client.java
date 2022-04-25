package Network.Review.C0408;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        String host="localhost";
        String host2="10.20.33.3";

        try{
            //////////////////////////////////// Step 3
            Socket socket= new Socket(host,8000);


            ///////////////////////////////////   STEP 5 -  Create data input and output streams
            DataInputStream inFromServer = new DataInputStream( socket.getInputStream());
            DataOutputStream outToServer = new DataOutputStream(  socket.getOutputStream());

            outToServer.writeUTF("Client said : " +
                    "Look like this worked!");

            System.out.println(inFromServer.readUTF());
            System.out.println(inFromServer.readUTF());


         } catch (IOException e) {

        }
    }
}
