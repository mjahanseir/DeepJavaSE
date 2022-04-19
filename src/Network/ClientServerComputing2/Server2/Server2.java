package Network.ClientServerComputing2.Server2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2{
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(8000);
        Socket socket= ss.accept();

        DataInputStream in= new DataInputStream(socket.getInputStream());
        DataOutputStream out= new DataOutputStream(socket.getOutputStream());

        out.writeUTF("Thanks from server....");
        String data= in.readUTF();

        System.out.println(data);

        out.writeUTF("Thanks");
        out.writeUTF(data);
    }


}