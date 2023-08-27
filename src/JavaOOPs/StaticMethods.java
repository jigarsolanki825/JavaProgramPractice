package JavaOOPs;

public class StaticMethods {

    private int count=0;
    private static int count1=0;

    private void getNonStaticCount(){
        this.count++;
        System.out.println("non static count :" +this.count);
    }

    private void getStaticCount(){
        count1++;
        System.out.println("static count :" +this.count1);
    }
    public static void main(String[] args) {

        StaticMethods staticMethods1 = new StaticMethods();
        staticMethods1.getNonStaticCount();
        staticMethods1.getStaticCount();
        System.out.println("-----------------------------");
        StaticMethods staticMethods2 = new StaticMethods();
        staticMethods2.getNonStaticCount();
        staticMethods2.getStaticCount();
        System.out.println("-----------------------------");
        StaticMethods staticMethods3 = new StaticMethods();
        staticMethods3.getNonStaticCount();
        staticMethods3.getStaticCount();
        System.out.println("-----------------------------");


    }
}
