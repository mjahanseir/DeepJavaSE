package COSC603_Advanced.COSC603_2022_03_16_IO;
// ADD BUFFER INPUT AND OUTPUT STREAM IN STRING
import java.io.*;

public class C3_BufferedStream {
    public static void main(String[] args) throws IOException {

        File file = new File("src/COSC603_Advanced.COSC603_2022_03_16_IO/temp.dat");

        try (DataOutputStream output = new DataOutputStream(   new BufferedOutputStream   (    new FileOutputStream(file,false)        ))) {
            output.writeUTF("Dave");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(95.5);
            output.writeUTF("Joe");
            output.writeDouble(80.5);
        }
        //   IN TRY CLAUSE (DataOutputStream output = new DataOutputStream(   new BufferedOutputStream   (    new FileOutputStream(file,false)        )))  IS EQUAL two lines:
        //                FileOutputStream output =  new FileOutputStream(file);
        //                   ADD->     BufferedOutputStream buffOut =  new BufferedOutputStream(output, 1024); // we can change default buffer size form 512Byte to any amount
        //                DataOutputStream outputStream= new DataOutputStream(buffOut);
        //  512 bytes default buffer size


        try (DataInputStream input = new DataInputStream(     new BufferedInputStream(     new FileInputStream(file)             ))) {
            // Read student test scores from the file
            while(true){
                System.out.println(input.readUTF() + " " + input.readDouble());
            }

        }catch(EOFException ex){
            System.out.println("Done reading the file");
        }

        // IN TRY CLAUSE (DataInputStream input = new DataInputStream(     new BufferedInputStream(     new FileInputStream(file)             ))) IS EQUAL two lines:
        //        FileInputStream FileIN= new FileInputStream(file);
        //              ADD->  BufferedInputStream buffInput = new BufferedInputStream(FileIN)
        //        DataInputStream input = new DataInputStream(buffInput);

    }

}
