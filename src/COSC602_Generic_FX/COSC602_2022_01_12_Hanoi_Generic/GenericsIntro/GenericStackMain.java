

public class GenericStackMain {

  public static void main(String[] args) {
    GenericStack<String> myStack= new GenericStack<>();

    myStack.push("Derrick");
    myStack.push("Nil");
//  myStack.push(5);

    System.out.println(myStack.getSize());
    System.out.println(myStack.peek());
    System.out.println(myStack.getSize());
    System.out.println(myStack.pop());
    System.out.println(myStack.getSize());
  }

}
