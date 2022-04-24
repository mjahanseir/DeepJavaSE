package Thread.Review.C0328.ThreadsDemo;
import static COSC604_2022_03_28_Thread.TreadDemo.TextColor.*;

public class MyThreadSubClass extends Thread{
    @Override
    public  void run(){
        System.out.println(BLUE+"Output from " + currentThread().getName()); // thread subclass
    }
}
