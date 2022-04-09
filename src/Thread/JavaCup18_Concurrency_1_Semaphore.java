package Thread;

import java.util.concurrent.Semaphore;

class MyRun implements Runnable{
    private Semaphore semaphore;

    public MyRun(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long id = Thread.currentThread().getId();
        System.out.println(id + " : started");
        function();
        System.out.println(id + " : finished");
        semaphore.release();
    }

    private void function() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class JavaCup18_Concurrency_1_Semaphore {
    public static void main(String[] args) {

        Semaphore semaphore1= new Semaphore(5);
        for(int i =0; i<10 ;i++){
            new Thread(new MyRun(semaphore1)).start();
        }
//        System.out.println("\t *****  Semaphore(1) ******");
//        Semaphore semaphore1= new Semaphore(2);
//        for(int i =0; i<10 ;i++){
//            new Thread(new MyRun(semaphore1)).start();
//        }
//        System.out.println("\t *****  Semaphore(2) ******");
//
//        Semaphore semaphore2= new Semaphore(2);
//
//        for(int i =0; i<10 ;i++){
//            new Thread(new MyRun(semaphore2)).start();
//        }
    }
}