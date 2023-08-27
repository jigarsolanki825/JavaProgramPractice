package threadex;


public class EvenOddNoUsingThread {
    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();
        Thread even = new Thread(new PrintTask(printer, 20, true));
        even.setName("evenThread");
        Thread odd = new Thread(new PrintTask(printer, 20, false));
        odd.setName("oddThread");
        System.out.print("ODD" + "\t");
        System.out.println("Even" + "\t");
        System.out.println("************");
        odd.start();
        even.start();


    }
}
class PrintTask implements Runnable {
    int max = 0;
    boolean isEven = false;
    EvenOddPrinter p = null;
    int num = 0;
    public PrintTask(EvenOddPrinter p, int max, boolean isEven) {
        this.p = p;
        this.max = max;
        this.isEven = isEven;
    }
    public void run() {
        num = (isEven) ? 2 : 1;
        while (num <= max) {
            if (isEven) {
                p.printEven(num);
            } else {
                p.printOdd(num);
            }
            num += 2;
        }
    }
}
class EvenOddPrinter {
    boolean isOdd = false;
    public synchronized void printEven(int number) {
        while (!this.isOdd) {
            try {
                System.out.println("Before wait : "+Thread.currentThread().getName());
                wait(1000);
                System.out.println("After wait : "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number + "\t");
        this.isOdd = false;
        System.out.println("Before notify : "+Thread.currentThread().getName());
        notify();
        System.out.println("After notify : "+Thread.currentThread().getName());
    }
    public synchronized void printOdd(int number) {
        while (this.isOdd) {
            try {
                System.out.println("Before wait : "+Thread.currentThread().getName());
                wait(1000);
                System.out.println("After wait : "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + "\t");
        this.isOdd = true;
        System.out.println("Before notify : "+Thread.currentThread().getName());
        notify();
        System.out.println("After notify : "+Thread.currentThread().getName());
    }
}
