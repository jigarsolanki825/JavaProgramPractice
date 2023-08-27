package threadex;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {


    //Shared Queue
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {


        //Producer Thread
        Thread producerThread = new Thread(() -> {
            try {
                producer();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        //Consumer Thread
        Thread consumerThread= new Thread(() -> {
            try {
                Thread.sleep(1000);
                consumer();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }

    private static void producer() throws InterruptedException{
        for (int i =0; i<10;i++) {
            Thread.sleep(5000);
            queue.put(i);
            System.out.println("Produced:" + i);
        }
    }

    private static void consumer() throws InterruptedException{
        for (int i=0;i<10;i++) {
            Thread.sleep(1000);
            System.out.println("Consumed:"+queue.take());
    }
}
}

