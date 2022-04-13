package Thread;

public class Y2_TestThread implements Runnable {
    public static void main(String[] args) {
        new Y2_TestThread();
    }
    public Y2_TestThread() {
        //Y2 task = new Y2();
        new Thread(this).start();
    }
    public void run() {
        System.out.println("test");
    }
}