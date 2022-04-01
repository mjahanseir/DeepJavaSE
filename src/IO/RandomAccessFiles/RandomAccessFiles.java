package IO.RandomAccessFiles;
import java.io.*;
public class RandomAccessFiles {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("src/IO/RandomAccessFiles/raf.dat", "rw")) {
            //Clear any file content to make the file empty
            raf.setLength(0);
            for (int i = 0; i < 100; i++)
                raf.writeInt(i);
            System.out.println("Current length for the file is " + raf.length());
            raf.seek(0);
            System.out.println("First value in file is " + raf.readInt());
            System.out.println("Second value in file is " + raf.readInt());
            //skip 6 int value
            raf.seek(8 * 4);
            System.out.println("Ninth number is " + raf.readInt());
            raf.writeInt(777);
            raf.seek(0);
            System.out.println("First number is " + raf.readInt());
            raf.seek(8 * 4);
            System.out.println("Ninth number is " + raf.readInt());
            raf.seek(9 * 4);
            System.out.println("Tenth number is " + raf.readInt());
            raf.seek(10 * 4);
            System.out.println("Eleventh number is " + raf.readInt());
            raf.seek(10 * 4-2);
            System.out.println("Eleventh number is.... garbage...... " + raf.readInt());
            System.out.println("Current length for the file is " + raf.length());
            raf.seek(raf.length());
            raf.writeInt(999);
            System.out.println("Current length for the file is " + raf.length());
        }
    }
}

