package Network.Review;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C1_NetworkClientSide {
    public static void main(String[] args) throws IOException {
        Socket socket= new Socket("localhost", 8008);
        DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());

        System.out.println(dataInputStream.readUTF());
        dataOutputStream.writeUTF("data from client");
    }
}

