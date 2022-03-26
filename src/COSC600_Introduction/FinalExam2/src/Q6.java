//import java.util.Scanner;
//
//public class Q6 {
//
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter a line of input to analyzed: ");
//        String input = scanner.nextLine().toLowerCase();
//
//
//    }
//
//    public static boolean isValid(String password) {
//        if (password.length() > 8) {
//            return false;
//        }
//        if ((password.contains("@") || password.contains("#")
//                || password.contains("!") || password.contains("~")
//                || password.contains("$") || password.contains("%")
//                || password.contains("^") || password.contains("&")
//                || password.contains("*") || password.contains("(")
//                || password.contains(")") || password.contains("-")
//                || password.contains("+") || password.contains("/")
//                || password.contains(":") || password.contains(".")
//                || password.contains(", ") || password.contains("<")
//                || password.contains(">") || password.contains("?")
//                || password.contains("|") || password.contains(" "))) {
//            return false;
//        }
//        int counter ;
//        while (true) {
//            counter = 0;
//
//            for (int i = 0; i <= 9; i++) {
//                String str1 = Integer.toString(i);
//                if (password.contains(str1)) {
//                    counter = 1;
//                }
//            }
//            if (counter == 0) {
//                return false;
//            }
//        }
//
//        while (true) {
//            counter = 0;
//            for (int i = 65; i <= 90; i++) {
//                String str = Character.toString(i);
//                if (password.contains(str)) {
//                    counter += 1;
//                }
//            }
//            if (counter == 0) {
//                return false;
//            }
//        }
//
//        while (true) {
//             counter = 0;
//             for (int i = 90; i <= 122; i++) {
//                String str1 = Character.toString(i);
//                if (password.contains(str1)) {
//                    counter = 1;
//                }
//            }
//            if (counter == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//}