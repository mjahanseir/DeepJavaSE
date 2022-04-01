package Thread;
public class C1_ThreadIntro {
    public static void main(String[] args) {
        // Step 1: create a task object
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(100);

        // Step 2: create a thread object with task
        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(print100);

        // Step 3: Start the thread's execution
        t1.start();
        t2.start();
        t3.start();
    }
}

class PrintChar implements Runnable{
    private  char charToPrint;
    private int times;
    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }
    @Override
    public void run() {
        for(int i = 0 ;i < times; i++){
            System.out.print(charToPrint);
        }
    }
}

class  PrintNum implements  Runnable{
    private  int numTimes;
    public PrintNum(int numTimes) {
        this.numTimes = numTimes;
    }
    @Override
    public void run() {
        for(int i = 0 ;i < numTimes; i++){
            System.out.print(" "+i);
        }
    }
}