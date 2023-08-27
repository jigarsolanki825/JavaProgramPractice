package GeneralExamples;

@FunctionalInterface
interface FunctionalInterface1 {
    int sum(int a, int b);

}

@FunctionalInterface
interface FunctionalInterface2 {
    default int sum1(int a, int b){
        return 0;
    }

    int sum(int a, int b);

    public static int sum2(int a,int b){
        return a+b;
    }

}

public class FunctionInterfaceDemo{

    public static void main(String[] args) {

        int a=10;
        int b=20;

        FunctionalInterface1 addTwoNum = (x,y)->x+y;
        int result = addTwoNum.sum(a,b);
        System.out.println(result);

    }
}

