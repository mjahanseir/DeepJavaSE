package Thread.TreadDemo;
import static Thread.TreadDemo.TextColor.*;

public class MyThreadSubClass extends Thread{
    @Override
    public  void run(){
        System.out.println(BLUE+"Output from " + currentThread().getName()); // thread subclass
    }
}
