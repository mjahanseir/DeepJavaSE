package Thread.Chapter32;

public class JavaCup17_Thread_3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Starts.");

        Scan scan = new Scan();

        Object obj = scan.obj = new Object();
        scan.start();
        synchronized (obj) {
            obj.wait();    }
        System.out.println("Main other jobs");
    }
}
class Scan extends Thread {
    public Object obj;

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Scan");
        synchronized (obj) {
            obj.notify();
        }
        System.out.println("Scan other jobs");
    }
}