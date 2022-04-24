package Thread.Review.C0328.ThreadsDemo;

import static Thread.Review.C0328.ThreadsDemo.TextColor.*;

public class SecondRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(CYAN + "Second Runnable class run() method.");
    }
}
