package Thread.Review.C0328.ThreadsDemo;
import static Thread.Review.C0328.ThreadsDemo.TextColor.*;

public class MyThreadSubClass extends Thread{
    @Override
    public  void run(){
        System.out.println(BLUE+"Output from " + currentThread().getName());
        // thread subclass
    }
}
