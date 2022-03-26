package COSC603_Advanced.COSC603_2022_03_18_IO;

import java.io.*;
import java.util.Date;

public class C2_SerializedArrays {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] numString = {"one", "two", "three", "four", "five"};

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/COSC603_2022_03_18/array.dat"))) {
            output.writeObject(numbers);
            output.writeObject(new Date());
            output.writeObject(numString);
        }
        File file = new File("src/COSC603_2022_03_18/array.dat");
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            int[] inputNumbers = (int[]) (input.readObject());

            for (int i = 0; i < inputNumbers.length; i++)
                System.out.println(inputNumbers[i] + " ");

        }
    }
}
