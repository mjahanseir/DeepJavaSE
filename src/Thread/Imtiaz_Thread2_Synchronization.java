package Thread;

public class Imtiaz_Thread2_Synchronization {
    public static void main(String[] args) {

        Sequence sequence= new Sequence();
        for(int i=0; i<100; i++){
            System.out.println(sequence.getNext());
        }

        Worker worker1= new Worker(sequence);
        Worker worker2= new Worker(sequence);
        worker1.start();
        worker2.start();
    }
}
class Sequence{
    private int value=0;

    public synchronized int getNext(){
            value++;
            return value;
        }

}class Worker extends Thread{
    Sequence sequence=null;
    public Worker(Sequence sequence) {
        this.sequence=sequence;
    }
    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + " Got value " + sequence.getNext());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}