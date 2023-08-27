package GeneralExamples;

class MyParent implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Singleton extends MyParent {

    private static final Singleton SINGLETON_INSTNACE = new Singleton(); //EAGER INITIALIZATION
    private static Singleton singletonInstance = null; //LAZY INITIALIZATION
    private Singleton(){
    }

    public static synchronized Singleton getSingletonInstance(){
        if(singletonInstance ==null){
            if(singletonInstance ==null){
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}

class SingletonDemo {
    public static void main(String[] args) throws CloneNotSupportedException {



        //Runtime r ;

        Singleton oneInstance1 = Singleton.getSingletonInstance();
        Singleton oneInstance2 = Singleton.getSingletonInstance();
        Singleton oneInstance3 = Singleton.getSingletonInstance();

        Singleton oneInstance4 = (Singleton)oneInstance3.clone();

        int oneInstance1HashCode = oneInstance1.hashCode();
        int oneInstance2HashCode = oneInstance2.hashCode();
        int oneInstance3HashCode = oneInstance3.hashCode();
        int oneInstance4HashCode = oneInstance4.hashCode();

        System.out.println(oneInstance1HashCode);
        System.out.println(oneInstance2HashCode);
        System.out.println(oneInstance3HashCode);

        System.out.println(oneInstance4HashCode);
    }
}
