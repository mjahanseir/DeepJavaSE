
public class Q4 {
    public static void main(String[] args) {


    }
    public static String encrypt(String inString) {
        String result = "";
        String input = "abcdefghijklmnopqrstuvwxyz";
        String key = "dwumnhvrfqzejoplgytibckasx";
        String keySample = "##########################";


        int postionS;
        int postionI;
        for (int iSample = 0; iSample < inString.length(); iSample++) {
            char sampleCh = inString.charAt(iSample);
            postionS = ((int) sampleCh) * 37 % 26;

            for (int iInput = 0; iInput < inString.length(); iInput++) {
                char inputCh = input.charAt(iInput);
                postionI = ((int) inputCh) * 37 % 26;

                if (postionI == postionS) {
                    for (int iKey = 0; iKey < key.length(); iKey++) {

                        if (sampleCh == ' ')
                            result += " ";
                        result += key.charAt(postionI);
                    }
                }
            }

        }
        return result;
    }
}

