public class CheckPoint441 {
    public static void main(String[] args) {


        String s1=" Welcome ";
        String s2=" welcome ";

                System.out.println("s1.equals(s2)   "+s1.equals(s2));
                System.out.println("s1.equalsIgnoreCase(s2)   "+s1.equalsIgnoreCase(s2));
                System.out.println("s1.compare(s2)   "+s1.compareTo(s2));
                System.out.println("s1.compareToIgnoreCase(s2)   "+s1.compareToIgnoreCase(s2));

                System.out.println("s1.startsWith(s2)   "+s1.startsWith("AAA"));
                System.out.println("s1.endsWith(s2)   "+s1.endsWith("AAA"));

                System.out.println("s1.length()   "+s1.length());
                System.out.println("s1.charAt()   "+s1.charAt(1));

                System.out.println("s1.concat()   "+s1.concat(s2));
                System.out.println("s1.substring(1)   "+s1.substring(2));
                System.out.println("s1.substring(4)   "+s1.substring(5));
                System.out.println("s1.toLowerCase()   "+s1.toLowerCase());
                System.out.println("s1.toUpperCase()   "+s1.toUpperCase());

                System.out.println("s1.trim()   "+s1.trim());
                System.out.println("s1.indexof()   "+s1.indexOf('e'));
                System.out.println("s1.Lastindexof()   "+s1.lastIndexOf('e'));


        System.out.println((int)(Math.log10(123.456789)+1));

    }
}
