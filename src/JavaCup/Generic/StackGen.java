package JavaFazli.Generics;
class A<T extends Integer>{

}
class B<T extends Object> extends A{

}

class Stack <T>{
    private T[] elements;
    private final int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.top=-1;
        elements = (T[]) new Object[size];
    }
    public T pop() throws Exception{
        if (top==-1)
            throw new Exception("Empty Stack");
        else
            return elements[top--];
    }
    public T push(T element) throws Exception{
        if (top == (size-1))
            throw new Exception("Full Stack");
        else
            return elements[++top]= element;
    }
    public void printAll(){
        for (int i=0; i<=top ; i++){
            System.out.println(elements[i]);
        }
    }
}
public class StackGen{

    public static <T extends Integer> void multiplyByTwo(T x){
        //System.out.println( x*2);
    }


    public static void main(String[] args) {

        Stack<String> stack1= new Stack<>(10);
        Stack stack2= new Stack(10);

        try {
            stack1.push("R1");
            stack1.push("R2");
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            stack1.printAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            stack2.push("R1");
            stack2.push("R2");
            stack2.push(23);
            stack2.push(2.5);
            stack2.push(true);
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            stack1.printAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
