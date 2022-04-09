package Thread;

class Task implements Runnable{
 ThreadLocal<Integer> tl = new ThreadLocal<>();
 public void run() {
   tl.set(tl.get() == null ? 1 : tl.get() + 1);
   long thrID = Thread.currentThread().getId();
   System.out.println(thrID + ":" + tl.get());
 }
}
