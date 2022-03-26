
public class Q3 {
    public static void main(String[] args) {
        System.out.println(generateKey());
    }

    public static String generateKey() {
        String result = "";
        String input = "abcdefghijklmnopqrstuvwxyz";
        String key =   "dwumnhvrfqzejoplgytibckasx";
        String sample = "this is a string";
        String keySample = "##########################";

        int seed=37;
        int postionS;
        int postionI;
        for (int iSample = 0; iSample < sample.length(); iSample++) {
            char sampleCh = sample.charAt(iSample);
            postionS=((int)sampleCh)* seed %26;
            keySample.replace('#',sampleCh);
            for (int iInput = 0; iInput < sample.length(); iInput++) {
                char inputCh = input.charAt(iInput);
                postionI=((int)inputCh)* seed %26;

                if (postionI==postionS) {
                    for (int iKey = 0; iKey < key.length(); iKey++) {

                        if (sampleCh == ' ')
                            result += " ";
                        result +=  key.charAt(postionI);
                    }
                }
            }


        }
        return result;
    }
}
    public static String generateKey(int seed){
        String result = "";
        String input = "abcdefghijklmnopqrstuvwxyz";
        String key =   "dwumnhvrfqzejoplgytibckasx";
        String sample = "this is a string";
        int postionS;
        int postionI;
        for (int iSample = 0; iSample < sample.length(); iSample++) {
            char sampleCh = sample.charAt(iSample);
            postionS=((int)sampleCh)* seed %26;

            for (int iInput = 0; iInput < sample.length(); iInput++) {
                char inputCh = input.charAt(iInput);
                postionI=((int)inputCh)* seed %26;

                if (postionI==postionS) {
                    for (int iKey = 0; iKey < key.length(); iKey++) {

                        if (sampleCh == ' ')
                            result += " ";
                        result +=  key.charAt(postionI);
                    }
                }
            }


        }
        return result;
    }
}


