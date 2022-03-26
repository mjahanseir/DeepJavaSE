package COSC603_Advanced.COSC603_2022_03_14_FileIntro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C1_FileIntro {

    public static void main(String[] args) throws IOException {

        ///////////////////////////////// FILE
        File myFile= new File("src/COSC603_Advanced.COSC603_2022_03_14_FileIntro/myFile.txt");

        try{

            PrintWriter output= new PrintWriter(myFile);
            output.println("Just some text as a test");
            output.println("And some more");

            output.close();

        }catch(FileNotFoundException ex){
            System.out.println("Something went wrong");
        }

        System.out.println(myFile.getAbsolutePath());


        ////////////////////////////////////   SCANNER

        // for exception, we have 2 ways:
        //      1- try catch  like File
        //      2-throw exception in main (throws IOException)

        Scanner input= new Scanner(myFile);

        System.out.println(input.nextLine());

        String inputString=input.nextLine();

        System.out.println(inputString);

        input.close();

    }
}
