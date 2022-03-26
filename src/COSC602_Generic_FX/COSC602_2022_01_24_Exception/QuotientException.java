package COSC60220220124Exception;

import java.io.IOException;
import java.util.Scanner;

public class QuotientException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two Integer : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            ////// code will successfully execute until an exception occurs
            System.out.println("Some stuff we do first");
            // The first thing on this Line us actually the Quotient(..) call
            //  an exception there means no output for this line or any other after
            //  it in the try part
            System.out.println(number1 + " / " + number2 + " is " + Quotient(number1, number2));
            System.out.println("Execute TRY stuff");
        } catch (ArithmeticException e) {
            //  Only execute in the case of an exception and
            // only if the type specified above occurs
            System.out.println("Exception!!");
            System.out.println(e.getMessage());
        }catch (IOException e) {
            //  Only execute in the case of an exception and
            // only if the type specified above occurs
            System.out.println("Exception!!");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("something went wrong somewhere");
        }

        try{
            System.out.println(method1());
        }catch (Exception e){
            System.out.println("something went wrong somewhere");
            e.printStackTrace();
        }
        finally{
            System.out.println("This Happens no matter what.");
        }
        System.out.println("Code after the above block will execute if try/catch execute successfully");
    }

    private static int Quotient(int number1, int number2) throws IOException{
        if (number2 == 0)
            //can provide a custom message to the exception
//            throw new ArithmeticException("You entered zero for the second number");
            throw new IOException("You entered zero for the second number");
        else
            return (number1 / number2);
    }

    private static int method1() {
        System.out.println(m2());
        return 1;
    }

    private static int m2() {
        try {
            System.out.println(1 / 0);
        }catch (Exception e){
            System.out.println("Divided by 0 - Invalid M2");
            // exception is handled at this point and no prior calling
            //  code will be aware of the exception unless we rethrow it
            //  the exception will continue back to calling code until it
            // is either caught or causes an unhandled
            throw e;
        }
        return 1;
    }
}