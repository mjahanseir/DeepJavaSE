package COSC603_2022_03_16_IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
///
public class C1_FileStream {
    public static void main(String[] args) throws IOException {

        File file = new File("src/COSC603_2022_03_16_IO/temp.dat");

        try(FileInputStream input = new FileInputStream(file)){  //  TRY WITH RESOURCES   // Create an output stream to the file

            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");

        }
        try( FileOutputStream output = new FileOutputStream(file, false)){
            // write in Binary File
            int value;
            for (int i = 100; i <= 120; i++)
                output.write(i);
            output.close();

            FileInputStream input2 = new FileInputStream(file);
            while ((value = input2.read()) != -1)
                System.out.print(value + " ");
            input2.close();

        }


    }
}
