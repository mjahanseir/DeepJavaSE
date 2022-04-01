package IO.ObjectIO;
import java.io.*;
import java.util.Date;
public class Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file= new File("src/IO/ObjectIO/array.dat");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] numString = {"one", "two", "three", "four", "five"};
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(file))) {
            output.writeObject(numbers);
            output.writeObject(new Date());
            output.writeObject(numString);
        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            int[] inputNumbers = (int[]) (input.readObject());

            for (int i = 0; i < inputNumbers.length; i++)
                System.out.println(inputNumbers[i] + " ");

        }
    }
}
