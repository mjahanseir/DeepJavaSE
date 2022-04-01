package IO.BinaryIO;
import java.io.*;
public class DetectEndOfFile {
    public static void main(String[] args) {
        File file= new File("src/IO/BinaryIO/temp.dat");
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
                output.writeDouble(14.5);
                output.writeDouble(143.25);
                output.writeDouble(13.2);
            }
            try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {
                while (true)
                    System.out.println(input.readDouble());
            }
        }
        catch (EOFException ex) {
            System.out.println("Done!");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}