package IO.BinaryIO;
import java.io.*;
public class FileStream {
    public static void main(String[] args) throws IOException {
        File file= new File("src/IO/BinaryIO/temp.dat");
        try (FileOutputStream output = new FileOutputStream(file)) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        try (FileInputStream input = new FileInputStream(file)){
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}