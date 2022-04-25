package Network.Review;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class C1_NetworkServerSide {
    public static void main(String[] args) throws IOException {
        ServerSocket server= new ServerSocket(8008);
        Socket socket= server.accept();
        DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());

        System.out.println(dataInputStream.readUTF());
        dataOutputStream.writeUTF("data from server");
    }
}

