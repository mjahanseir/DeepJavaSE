package Thread;
import java.util.concurrent.*;
class SumTask implements Callable<Integer> {
    private int num = 0;
    public SumTask(int num) {
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 1; i <= num; i++)
            result += i;
        return result;
    }
}
public class JavaCup18_5_ThreadLocal {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        SumTask sumTask = new SumTask(10);
        Future<Integer> future = service.submit(sumTask);
        Integer result = future.get();
        System.out.println(result);
    }
}
