package Thread.TreadDemo;
import static Thread.TreadDemo.TextColor.*;
public class Main {
    public static void main(String[] args) {

        //Step1:
        //     Main Thread execution
        System.out.println(MAGENTA + "First output from the main thread.");

        //Step2:
        //     Create subclass MyThreadSubClass and start it here.
        Thread threadSubClass= new MyThreadSubClass();

        //Step7:
        //      name a thread
        threadSubClass.setName("+++++++++++++++++ Thread  Subclass ++++++++++++++");

        threadSubClass.start();

        //Step3:
        //     Create an anonymous thread class
        new Thread(){                                   //Anonymous thread
            public void run(){
                System.out.println(GREEN + "Output from anonymous Thread class.");
            }
        }.start(); /// << need to start

        //Step5:
        //     Invoke a First Runnable task
        Thread myFirstRunnable= new Thread(new FirstRunnable());
        myFirstRunnable.start();

        //Step6:
        //     Alternate to step 5 - Invoke a Second Runnable task
        Thread mSecondRunnable= new Thread(new SecondRunnable() {
            @Override
            public void run() {
                super.run();
                System.out.println(YELLOW + "Anonymous implementation of Second Runnable");
            }
        });
        mSecondRunnable.start();

        //Step4:
        //     Another Main Thread output
        System.out.println(MAGENTA +  "Second output from the main thread.");

    }
}
