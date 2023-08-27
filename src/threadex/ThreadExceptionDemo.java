package threadex;

import java.util.HashMap;
import java.util.Map;

public class ThreadExceptionDemo extends Thread{



    public void run(){

        System.out.println("Thread is running");

    }

    public static void main(String[] args) {

        Thread thread1 =new Thread();
        thread1.start();

      /*  Thread thread2 =new Thread()
        thread.start();*/

        Map<String, String> emailMap = new HashMap<>();
        emailMap.put("jayapandiyan.m@hcl.com","Jay");
        emailMap.put("jayapandiyan.mani@ibm.com","Jay");
        emailMap.put("jayapandiyan.mani@ppd.com","Jay");
        emailMap.put("jigar.solanki@gmail.com","Jigar");
        emailMap.put("jigar.s@citi.com","Jigar");
        emailMap.put("kannan.mani@arcadia.com","Kannan");

    }
}
