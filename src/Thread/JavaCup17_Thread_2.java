package Thread;
class Interrupting extends Thread {

    public static void main(String[] a)
            throws InterruptedException{
        Interrupting t = new Interrupting();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }

        @Override
        public synchronized void run() {
            try {
                wait();
                System.out.println("After wait");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("Resume");
        }
}