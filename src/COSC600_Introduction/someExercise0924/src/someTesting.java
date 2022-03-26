public class someTesting {
    public static void main(String[] args) {


        String str1="Hello";
        String str2="hello";
        String str3="He";
        String str4=new String("Hello" );
        System.out.println("str1 == str2 " + (str1==str2));
        System.out.println("str1 == str4 " + (str1==str4));

        System.out.println("str1.equals(str2)=" + str1.equals(str2));
        System.out.println("str1.equals(str4)=" + str1.equals(str4));

        System.out.println("****************************************");

        System.out.println("str1.equalsIgnoreCase(str2)" +str1.equalsIgnoreCase(str2));

        System.out.println("str1.compareTo(str2) " +str1.compareTo(str2));
        System.out.println("str1.compareTo(str4) " +str1.compareTo(str4));

        System.out.println("str1.compareToIgnoreCase(str2)  "+str1.compareToIgnoreCase(str2));

        System.out.println("****************************************");

        System.out.println("str1.statWidth(str3) \""+ (str3)+ "\"  "+str1.startsWith(str3));
        System.out.println("str1.endsWith(str3) \""+ (str3)+ "\"  "+str1.endsWith(str3));

        System.out.println("****************************************");

        System.out.println("str1.contains(str3) "+ str1.contains(str3));
        System.out.println(str1.length());
        System.out.println(str1.substring(5));
        System.out.println("****************************************");

        String str5="Welcome to java";
        System.out.println(str5.indexOf('w'));
        System.out.println(str5.indexOf("e", 5));
        System.out.println(str5.lastIndexOf("e", 10));
        System.out.println(str5.lastIndexOf("e"));

        System.out.println("****************************************");

        String myStr1="Hi";
        String myStr2="123";

        System.out.println(Integer.parseInt(myStr2)+2);

    }
}
