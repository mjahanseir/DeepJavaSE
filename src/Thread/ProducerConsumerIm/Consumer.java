package Thread.ProducerConsumerIm;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> questionList=null;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList) {
            while (questionList.isEmpty()) {
                System.out.println("No question to answers waiting for producer to get answer");
                questionList.wait();
            }
        }
        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("Answer Question: "+ questionList.remove(0));
            questionList.notify();
        }
    }
    @Override
    public void run() {
        while(true){
            try {
                answerQuestion();
            } catch (InterruptedException e) {}
        }

    }
}
