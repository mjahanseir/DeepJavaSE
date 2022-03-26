package COSC603_Advanced.COSC603_2022_03_18_IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class C3_RandomAccessFile {

    public static void main(String[] args) throws IOException {

        try (RandomAccessFile inoutfile = new RandomAccessFile("src/COSC603_2022_03_18/inoutfile.dat", "rw")) {

            //Clear any file content to make the file empty
            inoutfile.setLength(0);

            for (int i = 0; i < 100; i++)
                inoutfile.writeInt(i);

            System.out.println("Current length for the file is " + inoutfile.length());

            inoutfile.seek(0);
            System.out.println("First value in file is " + inoutfile.readInt());
            System.out.println("Second value in file is " + inoutfile.readInt());

            //skip 6 int value
            inoutfile.seek(8 * 4);
            System.out.println("Ninth number is " + inoutfile.readInt());


            inoutfile.writeInt(777);

            inoutfile.seek(0);
            System.out.println("First number is " + inoutfile.readInt());

            inoutfile.seek(8 * 4);
            System.out.println("Ninth number is " + inoutfile.readInt());

            inoutfile.seek(9 * 4);
            System.out.println("Tenth number is " + inoutfile.readInt());

            inoutfile.seek(10 * 4);
            System.out.println("Eleventh number is " + inoutfile.readInt());

            inoutfile.seek(10 * 4-2);
            System.out.println("Eleventh number is.... garbage...... " + inoutfile.readInt());

            System.out.println("Current length for the file is " + inoutfile.length());

            inoutfile.seek(inoutfile.length());
            inoutfile.writeInt(999);

            System.out.println("Current length for the file is " + inoutfile.length());



        }
    }
}

