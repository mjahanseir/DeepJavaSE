public class StringInro {
    public static void main(String[] args) {

        String str1="Hello";
        String str2="world";
        String str3="hello";
        System.out.println("***************");


        System.out.println(str1.concat(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("compareToIgnoreCase :"+str1.compareToIgnoreCase(str3));
        System.out.println("Start with :"+str1.startsWith("He"));
        System.out.println("Contain :"+str1.contains("he"));
    }
}
