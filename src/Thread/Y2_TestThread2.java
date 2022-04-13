package Thread;

public class Y2_TestThread2 implements Runnable {
    public static void main(String[] args) {
        new Y2_TestThread2();
    }
    public Y2_TestThread2() {
        Thread t = new Thread(this);
        t.start();
        //t.start();
    }
    public void run() {
        System.out.println("test");
    }
}