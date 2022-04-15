package Thread;

public class JavaCup_Intrrupting2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Starts.");
        Scann scann = new Scann();
        Object obj = scann.obj = new Object();
        scann.start();
        synchronized (obj) {
            obj.wait();
        }
        System.out.println("Main other jobs");
    }
}
class Scann extends Thread {
    public Object obj;
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Scan");
        synchronized (obj) {
            obj.notify();
        }
        System.out.println("Scan other jobs");
    }
}
