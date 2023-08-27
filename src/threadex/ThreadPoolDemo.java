package threadex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo implements Runnable{

    private String name;

    public ThreadPoolDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Start task name: "+name+ "Thread name: " +Thread.currentThread().getName());
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("End task name: "+name+ "Thread name: " +Thread.currentThread().getName());

    }


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0;i<=100;i++){

            Runnable runnable = new ThreadPoolDemo("My worker thread: "+i);
            executorService.execute(runnable);
        }

        executorService.shutdown();

        while(!executorService.isTerminated()){}
        System.out.println("All thread requests are completed");

    }


}
