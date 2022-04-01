package Thread.TreadDemo;

import static Thread.TreadDemo.TextColor.*;
public class SecondRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(CYAN + "Second Runnable class run() method.");
    }
}
