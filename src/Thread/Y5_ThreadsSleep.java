package Thread;

class Y5_ThreadsSleep {
    public static void main(String[] args) {
        Thread thread1= new Thread( new PrnChar('a', 100));
        Thread thread2= new Thread(new PrnChar('b', 100));
        Thread thread3= new Thread(new PrnNumb(100));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrnChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrnChar(char charToPrint, int times) {
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

class PrnNumb implements Runnable {
    private int lastNum;

    public PrnNumb(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= lastNum; i++) {
                System.out.print(" " + i);
                if (i >= 50) Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
        }
    }
}
