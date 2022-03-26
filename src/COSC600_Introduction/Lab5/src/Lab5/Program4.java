package Lab5;

public class Program4 {
    public static void main(String[] args) {

        System.out.println(countVowels("zxcvbnm")); //0
        System.out.println(countVowels("this is a test")); //4

    }
    public static int countVowels(String inStr){
        int count=0;
        for (int i=0; i<inStr.length(); i++){
            switch (inStr.charAt(i)){
                case 'a': case 'e':  case 'i': case 'o': case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
