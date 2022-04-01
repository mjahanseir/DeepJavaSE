package Thread.TreadDemo;
import static Thread.TreadDemo.TextColor.*;
public class FirstRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(RED + "First Runnable class run() method.");
    }
}
