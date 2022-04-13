package Thread;

public class Y3_TestThread2 implements Runnable {
    public static void main(String[] args) {
        new Y3_TestThread2();
    }
    public Y3_TestThread2() {
        Thread t = new Thread(this);
        t.start();
        //t.start();
    }
    public void run() {
        System.out.println("test");
    }
}