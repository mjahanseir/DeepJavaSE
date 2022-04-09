package Thread;


import java.util.*;
import java.util.concurrent.*;

class WordLengthCallable implements Callable<Integer> {
    private String word;
    public WordLengthCallable(String word) {
        this.word = word;
    }
    public Integer call() {
        return word.length();
    }
}



public class JavaCup18_3_Executors4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newCachedThreadPool();

        Set<Future<Integer>> set = new HashSet<>();

        String[] words = { "Mike", "John", "Ryan" };

        for (String word : words) {
            Callable<Integer> callable = new WordLengthCallable(word);

            // SUBMIT here except in executor and Runnable
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }

        int sum = 0;
        for (Future<Integer> future : set)
            sum += future.get();
        System.out.println("The sum of lengths is " + sum);


    }
}
