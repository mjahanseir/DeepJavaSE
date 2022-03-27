package JavaCup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Scanner;

public class IO_Excercise_01 {
    public static void main(String[] args) {
        File file= new File("src/JavaCup/test.txt");

//        System.out.println(file.length());
//        System.out.println(file.canRead());
//        System.out.println(file.lastModified());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

        try {
            Scanner scanner= new Scanner(file);
            Formatter formatter= new Formatter("src/JavaCup/test2.txt");

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.startsWith("BAD"))
                    formatter.format("%s\n", line);
            }
            scanner.close();
            formatter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
