package Thread.Review;

public class C1_ThreadAndRunnable {
    public static void main(String[] args) {

        Thread t1= new Thread(new chr(100, 'a'));
        Thread t2= new Thread(new chr(100, 'b'));
        Thread t3= new Thread(new num(100));

        t1.start();
        t2.start();
        t3.start();
    }
}
class chr implements Runnable{
    private int num;
    private char ch;

    public chr(int num, char ch) {
        this.num = num;
        this.ch = ch;
    }
    @Override
    public void run() {
        for(int i=0 ; i<num ;i++){
            System.out.println(ch);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class num implements Runnable{
    private  int number;
    public num(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        for(int i=1; i<=number ; i++){
            System.out.println(number);
        }

    }
}
