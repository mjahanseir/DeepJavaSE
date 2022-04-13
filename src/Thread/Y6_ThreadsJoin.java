package Thread;

class Y6_ThreadsJoin {
    public static void main(String[] args) {
        Thread thread1= new Thread( new PrnChara('a', 100));
        Thread thread2= new Thread(new PrnChara('b', 100));
        Thread thread3= new Thread(new PrnNumber(100));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrnChara implements Runnable {
    private char charToPrint;
    private int times;

    public PrnChara(char charToPrint, int times) {
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

class PrnNumber implements Runnable {
    private int lastNum;

    public PrnNumber(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        Thread thread4 = new Thread(new PrintChar('M', 40));
        thread4.start();
        try {
            for (int i = 1; i <= lastNum; i++) {
                System.out.println (" " + i);
                if (i == 50) thread4.join();
            }
        }
        catch (InterruptedException ex) {
        }
    }
}
