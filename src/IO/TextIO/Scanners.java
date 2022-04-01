package IO.TextIO;
import java.io.*;
import java.util.Scanner;
public class Scanners {
    public static void main(String[] args) throws Exception {
        File file = new File("src/IO/TextIO/scores.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String fName = input.next();
            String mi = input.next();
            String lName = input.next();
            int score = input.nextInt();
            System.out.println(fName + " " + mi + " " + lName + " " + score);
        }
        input.close();
    }
}