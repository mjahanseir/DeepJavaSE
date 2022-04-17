package Thread.ProducerConsumerBlockingQueue.ProducerConsumerIm;
import java.util.concurrent.BlockingQueue;
public class Producer implements Runnable{
    int questionNumber;
    BlockingQueue<Integer> questionQueue;
    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                int nextQuestion = questionNumber++;
                System.out.println("Got new Question " + nextQuestion);
                synchronized (this) {
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
            }
        }
    }

}
