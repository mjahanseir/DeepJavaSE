public class printfStudy {
    public static void main(String[] args) {


        double amount =12618.98;
        double interestRate=0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $"+ interest);
        System.out.println("Interest is $"+(int)(interest*100)/100.0);
        System.out.println("*************************");

        System.out.printf("Interest is $%4.2f", interest);
        System.out.printf("My name is %S and I am a %s in saskpoly" , "Mohammad", "Student");

        System.out.printf("\nhi %c hey" , 'd');
        System.out.printf("\nhi %c hey" , 'D');
        System.out.printf("\nhi %C hey" , 'd');
        System.out.printf("\nhi %C hey" , 'D');

        System.out.println("*************************");

        System.out.printf("%3d%n" ,9);
        System.out.printf("some");

        System.out.printf("some text");
        System.out.printf("some other text");
        System.out.printf("%n");
        System.out.printf("some text");
        System.out.printf("some other text");

        System.out.println("##########################");

        System.out.printf("%5b", -1);
        System.out.printf("%5c", 'f','f');
        System.out.printf("%3.2f\n" , 12.68521);
        System.out.printf("%12s %n", "12345678901234567");

        System.out.printf("%.2f", 123456.789);
    }
}
