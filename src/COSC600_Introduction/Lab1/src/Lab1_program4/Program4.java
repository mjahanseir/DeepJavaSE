package Lab1_program4;

public class Program4 {
    public static void main(String[] args) {
        /*
        Exercise 4. Use variables and the concatenation operator to produce the following output.
        This is COSC600 - Intro Programming
        - Create a new package - call it Lab1_program4
        - Create a new Java class within the above package - call it Program4
        - Add your public static void main method
        - Add four variables, text1, courseName, courseNum and text2. Declare them as String, String, int, String
        - Assign values to them as follows:
            text1 -> "This is"
            courseName -> "COSC"
            courseNum -> 600
            text2 -> " - Intro Programming"
        - Add a single System.out.println call to output the above text.
            Correct Output:
            This is COSC600 - Intro Programming
         */
        String text1 = "This is ";
        String courseName = "COSC";
        int courseNum = 600;
        String text2 = " - IntroProgramming";
        System.out.println(text1 + courseName + courseNum + text2);
    }
}
