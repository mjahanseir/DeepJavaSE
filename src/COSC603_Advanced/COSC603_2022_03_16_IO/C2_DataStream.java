package COSC603_Advanced.COSC603_2022_03_16_IO;
//Listing 17.2 TestDataStream.java
import java.io.*;

public class C2_DataStream {
    public static void main(String[] args) throws IOException {

        File file = new File("src/COSC603_Advanced.COSC603_2022_03_16_IO/temp.dat");

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file,false))) {
            output.writeUTF("Dave");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(95.5);
            output.writeUTF("Joe");
            output.writeDouble(80.5);
        }
        // IN TRY CLAUSE ( DataOutputStream output = new DataOutputStream(new FileOutputStream(file)) )IS EQUAL two lines:
        //        FileOutputStream output =  new FileOutputStream(file);
        //        DataOutputStream outputStream= new DataOutputStream(output);

        try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {
            // Read student test scores from the file
            while(true){
                System.out.println(input.readUTF() + " " + input.readDouble());
            }
        //            System.out.println(input.readUTF() + " " + input.readDouble());
        //            System.out.println(input.readUTF() + " " + input.readDouble());
        }catch(EOFException ex){
            System.out.println("Done reading the file");
        }
        // IN TRY CLAUSE (DataInputStream input = new DataInputStream(new FileInputStream(file) ) IS EQUAL two lines:
        //        FileInputStream input= new FileInputStream(file);
        //        DataInputStream inputData = new DataInputStream(input);

    }
}