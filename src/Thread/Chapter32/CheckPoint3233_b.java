package Thread.Chapter32;

public class CheckPoint3233_b implements Runnable {
    public static void main(String[] args) {
        new CheckPoint3233_b();
    }

    public CheckPoint3233_b() {
        Thread t = new Thread(this);
        t.start();
        //t.start();
    }

    public void run() {
        System.out.println("test");
    }
}
