package Thread;

class PrintThread implements Runnable{
    @Override
    public void run() {
        for (int counter =0 ; counter<100 ; counter++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter);
        }
        Thread currentThread = Thread.currentThread();
        System.out.println("Class id "+currentThread.getId());
        System.out.println("Class name "+currentThread.getName());
    }
}

public class JavaCup17_Thread_1 {
    public static void main(String[] args) {
        new Thread(new PrintThread()).start();
        for (char C='A' ; C<='Z' ; C++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(C);
            Thread currentThread = Thread.currentThread();
            System.out.println("Main ID" + currentThread.getId());
            System.out.println("Main Name " + currentThread.getName());
        }
    }
}
