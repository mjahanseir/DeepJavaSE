public class Test {
    public static void main(String[] args) {

        String test="I am Fine!";
        System.out.println(test);
        System.out.println(str(test));
        System.out.println(test);
    }
    public static String str(String strInput){
        strInput += "suffix";
        return  strInput ;
    }
}
