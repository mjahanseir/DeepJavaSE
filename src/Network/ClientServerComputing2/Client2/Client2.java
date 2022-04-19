package Network.ClientServerComputing2.Client2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket= new Socket("localhost",8000);

        DataInputStream in= new DataInputStream(socket.getInputStream());
        DataOutputStream out= new DataOutputStream(socket.getOutputStream());

        out.writeUTF("Comes from Client");


        System.out.println(in.readUTF());
        System.out.println(in.readUTF());
    }

}