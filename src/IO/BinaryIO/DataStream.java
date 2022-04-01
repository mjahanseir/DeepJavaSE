package IO.BinaryIO;
import java.io.*;
public class DataStream {
    public static void main(String[] args) throws IOException {
        File file= new File("src/IO/BinaryIO/temp.dat");
        try ( DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        try ( DataInputStream input = new DataInputStream(new FileInputStream(file))){
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}

