package COSC60220220124Exception;

public class ArrayProcessing {
    public static void main(String[] args) {
        int[] myList=new int[5];

        //initialize value randomly

        try {
            for (int i = 0; i <= myList.length; i++) {
                myList[i] = (int) (Math.random() * 100);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong Indexes!!!!");
        }catch (ArithmeticException e){
            System.out.println("Wrong ...");
        }catch (IllegalArgumentException e){
            System.out.println(".........!");
        }
    }
}
