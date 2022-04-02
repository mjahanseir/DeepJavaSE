package Thread.Chapter32;

public class CheckPoint3233_b implements Runnable {
    public static void main(String[] args) {
        new CheckPoint3233_b();
    }

    public CheckPoint3233_b() {
         // CheckPoint3233_a task = new CheckPoint3233_a();
        //new Thread(task).start();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("test");
    }
}
