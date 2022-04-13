package Thread;

class Y4_TreadsYield {
    public static void main(String[] args) {
        Thread thread1= new Thread( new PrnCh('a', 100));
        Thread thread2= new Thread(new PrnCh('b', 100));
        Thread thread3= new Thread(new PrnNum(100));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrnCh implements Runnable {
    private char charToPrint;
    private int times;

    public PrnCh(char charToPrint, int times) {
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

class PrnNum implements Runnable {
    private int lastNum;

    public PrnNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
            Thread.yield();
        }
    }
}
