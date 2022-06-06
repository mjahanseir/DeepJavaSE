package S9p1Stack;

public class TestStack {
    public static void main(String[] args) {

        StackInteger s= new StackInteger(10);

        s.push(5);
        s.push(6);
        s.push(10);

        System.out.println("***** Stack Element ******");
        s.printStack();
        System.out.println("**** some operation *******");

        System.out.println("Item in Stack: " + s.getSize());
        System.out.println("After Peek(): " +s.peek());

        System.out.println("Item in Stack: " + s.getSize());
        System.out.println("After POP(): " + s.pop());

        System.out.println("Item in Stack: " + s.getSize());



        System.out.println("Is the stack empty? " + s.empty());

        System.out.println("***********");

        System.out.println(s.toString());

        System.out.println("***********");
        s.printStack();
    }
//    public void printStack(){
//
//    }
}
