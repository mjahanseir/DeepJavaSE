package COSC603_Advanced.COSC603_2022_03_16_IO;
import java.io.*;
//Listing 17.4 Copy.java
public class C4_FileCopy {
    public static void main(String[] args) throws IOException{

        //first check for args number
        if (args.length != 2) {
            System.out.println( "Need to enter both source and destination file name");
            System.exit(1);
        }

        // Check if source file exists
        File source = new File(args[0]);
        if (!source.exists()) {
            System.out.println("Source file " + args[0]  + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File destination = new File(args[1]);
        try (
                // Create an input stream
                BufferedInputStream input =  new BufferedInputStream(new FileInputStream(source));

                // Create an output stream
                BufferedOutputStream output =  new BufferedOutputStream(new FileOutputStream(destination));
        ) {
            // Continuously read a byte from input and write it to output
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            // Display the file size
            System.out.println("wrote " + numberOfBytesCopied + " bytes of data");
        }
    }
}
