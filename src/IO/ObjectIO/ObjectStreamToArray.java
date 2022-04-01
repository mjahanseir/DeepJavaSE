package IO.ObjectIO;
import java.io.*;
public class ObjectStreamToArray {
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        File file= new File("src/IO/ObjectIO/array.dat");
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try ( ObjectOutputStream output = new ObjectOutputStream(new
                FileOutputStream(file, true)) ) {
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try ( ObjectInputStream input =new ObjectInputStream(new FileInputStream(file));
        ) {
            int[] newNumbers = (int[])(input.readObject());
            String[] newStrings = (String[])(input.readObject());

            for (int i = 0; i < newNumbers.length; i++)
                System.out.print(newNumbers[i] + " ");
            System.out.println();

            for (int i = 0; i < newStrings.length; i++)
                System.out.print(newStrings[i] + " ");
        }
    }
}