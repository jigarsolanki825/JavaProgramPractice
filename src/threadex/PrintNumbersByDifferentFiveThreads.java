package threadex;

public class PrintNumbersByDifferentFiveThreads implements Runnable{
    private volatile int count =0;

    @Override
    public void run(){
        count+=1;
        System.out.println(count);
    }



    public static void main(String[] args) {

        Runnable r1 =new PrintNumbersByDifferentFiveThreads();
        Runnable r2 =new PrintNumbersByDifferentFiveThreads();
        Runnable r3 =new PrintNumbersByDifferentFiveThreads();
        Runnable r4 =new PrintNumbersByDifferentFiveThreads();
        Runnable r5 =new PrintNumbersByDifferentFiveThreads();

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r3);
        Thread thread4 = new Thread(r4);
        Thread thread5 = new Thread(r5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
