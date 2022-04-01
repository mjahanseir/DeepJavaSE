package IO.BinaryIO;
import java.io.*;
public class copy {
    public static void main(String[] args) throws IOException {
        // Check command-line parameter usage
        if (args.length != 2) {
            System.out.println( "Copy sourceFile targetfile");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1]+ " already exists");
            System.exit(3);
        }
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream output =new BufferedOutputStream(new FileOutputStream(targetFile));
        ) {
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}