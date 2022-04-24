package Network.Review.C0328.ThreadsDemo;
import static COSC604_2022_03_28_Thread.TreadDemo.TextColor.*;

public class FirstRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(RED + "First Runnable class run() method.");
    }
}
