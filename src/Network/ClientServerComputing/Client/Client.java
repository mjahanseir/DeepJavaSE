package Network.ClientServerComputing.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
            //The Client class uses the following statement to create a socket
            // that will request a connection to the server on the same machine
            // (localhost) at port 8000

            String host="localhost";
            String host2="127.0.0.1 ";

            try{
                Socket socket= new Socket(host,8000);

                DataInputStream dataInputStream= new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());

                dataOutputStream.writeUTF("Comes from Client");

                System.out.println(dataInputStream.readUTF());
                System.out.println(dataInputStream.readUTF());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }