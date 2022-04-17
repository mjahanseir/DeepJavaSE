package Thread;

public class Imtiaz_Thread1 {
    public static void main(String[] args) {

        System.out.println("Main Task");

        TaskRun taskRun = new TaskRun("Th-A");
        taskRun.start();

        System.out.println("other part of  Task");

        TaskRun taskRun2 = new TaskRun("Th-B");
        taskRun2.start();

        System.out.println("the some other part of  Task");

    }
}
class TaskRun extends Thread{
    String name;

    public TaskRun(String name) {
        this.name = name;
    }

    public void run(){
        Thread.currentThread().setName(this.name);
        for(int i=0; i<10;i++)
            System.out.println("number : " + i + " - " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}