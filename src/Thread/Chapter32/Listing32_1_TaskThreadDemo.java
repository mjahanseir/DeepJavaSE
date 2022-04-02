package Thread.Chapter32;   public class Listing32_1_TaskThreadDemo {
  public static void main(String[] args) {
    // Create tasks
    Runnable printA = new PrintChar('a', 100);
    Runnable printB = new PrintChar('b', 100);
    Runnable print100 = new PrintNum(100);

    // Create threads => To run tasks concurrently, three threads are created
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);
    Thread thread3 = new Thread(print100);

    // Start threads => The start() method is invoked to start a thread that
    // causes the run() method in the task to be executed.
    // When the run() method completes, the thread terminates.
    thread1.start();
    thread2.start();
    thread3.start();

    // Runnable r = new PrintChar(....); + Thread t1 = new Thread(r);
    //           ==>  Thread t1 = new Thread(  new PrintChar(....)  );
    Thread t1 = new Thread(new PrintChar('c', 100));
    t1.start();
    Thread t2 = new Thread(new PrintChar('d', 100));
    t2.start();
    Thread t3 = new Thread(new PrintNum(100));
    t3.start();

  }}
/////////////////////////////////////////////////////////////////////////////

//   The PrintChar class implements Runnable and overrides the run() method
//   with the print-character action.
//   This class provides a framework for printing any single character a given
//   number of times.
//    The runnable objects, printA and printB, are instances of the PrintChar class.


// The task for printing a specified character in specified times
class PrintChar implements Runnable {
  private char charToPrint;            // The character to print
  private int times;                   // The times to repeat

  /** Construct a task with specified character and number of
       times to print the character   */
  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  // Override the run() method to tell the system what the task to perform
  @Override
  public void run() {
    for (int i = 0; i < times; i++) {
      System.out.print(charToPrint);
    }
  }
}
/////////////////////////////////////////////////////////////////////////////

//   The PrintNum class (lines 44–58) implements Runnable and overrides the
//   run() method with the print-number action.
//   This class provides a framework for printing numbers from 1 to n, for
//   any integer n.
//   The runnable object print100 is an instance of the class printNum class.


// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
  private int lastNum;

  /** Construct a task for printing 1, 2, ... i */
  public PrintNum(int n) {
    lastNum = n;
  }

  // Tell the thread how to run
  @Override
//  public void run() {
//    for (int i = 1; i <= lastNum; i++) {
//      System.out.print(" " + i);
//    }
//  }
  public void run() {
    Thread thread4 = new Thread(  new PrintChar('c', 40));
    thread4.start();
    try {
      for (int i = 1; i <= lastNum; i++) {
        System.out.print (" " + i);
        if (i == 50) thread4.join();
      }
    }
    catch (InterruptedException ex) {
    }
  }
}
