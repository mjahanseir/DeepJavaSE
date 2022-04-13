package Thread;

public class Y1_TaskThreads {
    public static void main(String[] args) {
        Thread thread1= new Thread( new PrintCharacter('a', 100));
        Thread thread2= new Thread(new PrintCharacter('b', 100));
        Thread thread3= new Thread(new PrintNumber(100));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class PrintCharacter implements Runnable {
    private char charToPrint;
    private int times;

    public PrintCharacter(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}
class PrintNumber implements Runnable {
    private int lastNum;

    public PrintNumber(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }
}
