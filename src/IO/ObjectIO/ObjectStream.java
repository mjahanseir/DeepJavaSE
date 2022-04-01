package IO.ObjectIO;
import java.io.*;
import java.util.Date;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file= new File("src/IO/ObjectIO/object.dat");
        //////////// Object Output Stream
        try ( ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeUTF("Alice"); output.writeDouble(65.5); output.writeObject(new Date());
            output.writeUTF("Mike"); output.writeDouble(75.5); output.writeObject(new Date());
        }

        //////////// Object Input Stream
        try ( ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println(input.readUTF() + " " + input.readDouble() + " " + input.readObject());
            System.out.println(input.readUTF() + " " + input.readDouble() + " " + input.readObject());
        }
    }
}
