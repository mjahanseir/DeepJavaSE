package Thread.Chapter32;

public class CheckPoint3233_a implements Runnable {
    public static void main(String[] args) {
        new CheckPoint3233_a();
    }

    public CheckPoint3233_a() {
         // CheckPoint3233_a task = new CheckPoint3233_a();
        //new Thread(task).start();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("test");
    }
}
