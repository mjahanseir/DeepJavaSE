package Thread.Review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C3_ExecutorServiceInterface {
    public static void main(String[] args) {
        ExecutorService exe= Executors.newFixedThreadPool(3);
        exe.execute(new chr(100,'a'));
        exe.execute(new chr(100,'b'));
        exe.execute(new num(100));
        //exe.shutdown();
    }
}
