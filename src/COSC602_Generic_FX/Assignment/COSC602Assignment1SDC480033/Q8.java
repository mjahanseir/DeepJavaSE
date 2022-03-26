package Assignment1;

import java.io.File;
import java.util.*;

public class Q8 {
    /*
    In your textbook, go through program listing 21.7 in section 21.4.
    The program counts any keywords it finds in a java file.
    Revise the program such that if a keyword is in a comment or in a string, don’t count it.
    Pass the Java file name from the command line.
    For simplicity, you can assume the Java source code is correct and line comments and
    paragraph comments don’t overlap.
    Your solution must use the code from 21.7.
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = input.nextLine();

        File file = new File(args[0]);
        if (file.exists()) {
            System.out.println("The number of keywords in " + args[0]
                    + " is " + countKeywords(file));
        } else {
            System.out.println("File " + args[0] + " does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner fileIn = new Scanner(file);

        while (fileIn.hasNext()) {
            String inp = fileIn.next();
            if (inp.equals("//")) {
                fileIn.nextLine();
            } else if (inp.contains("/*")) {
                String lookNext;
                do {
                    lookNext = fileIn.next();
                } while (!lookNext.contains("*/"));
            } else if (keywordSet.contains(inp))
                count++;
        }
        return count;
    }
}
