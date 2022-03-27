package JavaCup;

import java.io.File;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class IO_Excercise_02 {
    public static void main(String[] args) throws IOException {


//        File file= new File("/Users/mojahan/Documents/Student.java");
        File file= new File("/Users/mojahan/Documents/1.txt");
//        System.out.println(file.length());
//        System.out.println(file.canRead());
//        System.out.println(file.lastModified());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

        try (
            Scanner scanner = new Scanner(file);
            Formatter formatter = new Formatter("/Users/mojahan/Documents/2.txt");
           ){
            while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.startsWith("BAD"))
                        formatter.format("%s\n", line);
                }

        }catch (IOException ex){
            System.out.println("Error");
        }



    }
}
