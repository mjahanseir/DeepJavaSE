import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);


        Scanner input=new Scanner(System.in);

        int inNum=0;
        while (true){
            System.out.print(num1 +" + " + num2 +" is: ");
            inNum=input.nextInt();
             if(inNum!= num1+num2)
                 System.out.print("Wrong! try again\n");
             else{
                 System.out.println("Wow! is correct");
                 break;
             }
        }

    }


}
