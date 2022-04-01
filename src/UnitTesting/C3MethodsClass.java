package UnitTesting;

public class C3MethodsClass {

    public static int smallest(int num1, int num2, int num3) {

        int result = 0;
        if (num1 < num2) {
            if (num1 < num3)
                result = num1;
            else
                result = num3;
        } else {
            if (num2 < num3)
                result = num2;
            else
                result = num3;
        }
        return result;
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    public static String middle(String input) {
        int position=0;
        int length=0;
        if (input.length() % 2 == 0) {   //////////////////EVEN
            position = input.length() / 2 - 1;
            length = 2;
        }
        else {                             //////////////////ODD
            position = input.length() / 2;
            length = 1;
        }

        return input.substring(position, position + length);
    }
    /**
     public static String middle(String inStr) {
     int position;
     int length;
     if (inStr.length() % 2 == 0) {
     position = inStr.length() / 2 - 1;
     length = 2;
     } else {
     position = inStr.length() / 2;
     length = 1;
     }
     return inStr.substring(position, position + length);
     }
     **/
    public static int countVowels(String inString) {
        int count = 0;
        for (int i = 0; i < inString.length(); i++) {
            switch (inString.charAt(i)) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }

    public static int count_Words(String inString) {
        int count = 0;
        if (!((" ".equals(inString.substring(0, 1))) ||
                (" ".equals(inString.substring(inString.length() - 1))))) {
            for (int i = 0; i < inString.length(); i++) {
                if (inString.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
}