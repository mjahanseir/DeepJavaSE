package Lab5;


public class Program5 {
    public static void main(String[] args) {

        System.out.println(countWord("java"));
        System.out.println(countWord("This is a test"));

    }
    public static int countWord(String inStr){
        int count=0;
        //neither the first or last characters of the string is a space
        if(!(inStr.startsWith(" ") && inStr.endsWith(" "))){
            for (int i=0; i<inStr.length(); i++){
                if(inStr.charAt(i)==' ')
                    count++;
            }
            count++;
        }
        return count;
    }
}
