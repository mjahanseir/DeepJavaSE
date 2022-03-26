public class Ex2 {
    public static void main(String[] args) {

        String  surname = "Simpson";
        System.out.println(  "The third character of " + surname + " is " +
                surname.charAt( 2 ) );

        String  name = "Homer";
        char  c = name.charAt( 0 );
        System.out.println("Homer " +c) ;
        System.out.println("****************");

        String str = "inflammable";
        String substr = str.substring( 2 );
        System.out.println(substr);


        String str1 = "motown";
        int index = str1.indexOf( "tow" );
        System.out.println(index);

        System.out.println("=====================");

        int pre = 6;

        int post = 6;

        System.out.println("Result of preincrement " + ++pre);

        System.out.println("Result of postincrement " + post++);

        System.out.println("Values are " + pre + " " + post);


    }
}
