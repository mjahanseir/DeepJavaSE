package Thread.Review;

public class ProducerConsumerProgram {

    public static void main(String[] args) {

    }//END OF main

    /**  adding an int to the buffer */
    private static class Producer implements Runnable{
        @Override
        public void run() {
        }
    }// END OF PRODUCER
    /** reading and deleting an int from the buffer */
    private static class Consumer implements Runnable{
        @Override
        public void run() {
        }
    }// END OF CONSUMER

    /** n inner class for buffer */
    private static class Buffer{
        public void write(int value){}
        public int read(){}
    }// END OF BUFFER

}//END OF CLASS
