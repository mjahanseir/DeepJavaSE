package Ch07ArraySingleDim.CaseStudy;

public class CS78MyApproach {
    public static void main(String[] args) {

        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++)
            chars[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));

        printArr(chars);
        int[] count=countLetter(chars);
        printcount(count);

    }

    public static int[] countLetter(char[] input) {
        int[] counts = new int[26];
        for (int i = 0; i < input.length; i++) {
            counts[input[i] - 'a']++;
        }
        return counts;

    }

    public static void printArr(char[] input) {
        for (int i = 0; i < input.length; i++) {
         if((i+1)%20==0)
            System.out.println(input[i] );
         else
            System.out.print(input[i] + " ");
        }
    }
    public static void printcount(int[] input) {
        for (int i = 0; i < input.length; i++)
            System.out.print(((char)(i+'a')) + input[i] + " ");
    }
}