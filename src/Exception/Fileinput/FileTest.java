package COSC60220220126Exception.Fileinput;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {

        File myFile= new File("src/COSC60220220126Exception/Fileinput/movie2.txt");
        System.out.println("DOES the file exist? " + myFile.exists());
        System.out.println("The file is "+myFile.length() + " bytes long.");

        System.out.println("*********************************************");

        System.out.println("The file can be read? "+ myFile.canRead());
        System.out.println("The file can be written? "+ myFile.canWrite());
        System.out.println("The file can be execute? "+ myFile.canExecute());

        System.out.println("*********************************************");

        System.out.println("The absolute path to the file is: " + myFile.getAbsolutePath());


        System.out.println("******************  PRINT WRITER  ***************************");

        try {
            PrintWriter output = new PrintWriter(myFile);
            output.print("Test");
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
