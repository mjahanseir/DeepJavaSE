package Network.Review;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C5_StudentServer{
    private ObjectOutputStream outputToFile;
    private ObjectInputStream inputFromClient;
    public static void main(String[] args) {
        new C5_StudentServer();
    }
    public C5_StudentServer(){
        try {
            ServerSocket serverSocket= new ServerSocket(8005);
            System.out.println("Server Started");
            outputToFile= new ObjectOutputStream(new FileOutputStream("src/Network/Review/student.dat",true));

            while(true){
                Socket socket= serverSocket.accept();
                Object obj= inputFromClient.readObject();
                outputToFile.writeObject(obj);
                System.out.println("a new student obj stored");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputFromClient.close();
                outputToFile.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}