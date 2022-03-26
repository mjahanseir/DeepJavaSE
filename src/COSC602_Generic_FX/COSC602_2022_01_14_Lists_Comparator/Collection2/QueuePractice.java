package Collection2;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Stack<String> myStack= new Stack<>();

        myStack.push("You");
        myStack.push("Me");
        myStack.push("Them");

        System.out.println(myStack.pop());


        System.out.println("********************");


        Queue<String> myQueue= new PriorityQueue<>();
        myQueue.offer("You");
        myQueue.offer("Me");
        myQueue.offer("Them");

        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());

        System.out.println("********************");

        Queue<String> myQueue2= new LinkedList<>();
        myQueue2.offer("You");
        myQueue2.offer("Me");
        myQueue2.offer("Them");

        System.out.println(myQueue2.peek());
        System.out.println(myQueue2.poll());
        System.out.println(myQueue2.peek());

    }
}
