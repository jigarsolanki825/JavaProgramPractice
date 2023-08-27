package HashMapEx;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {

      //  Map<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        //concurrentHashMap.put(,null);

        String s1 = "JAVA";
        String s2 = "JAVA";
        s1="C++";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s2.hashCode());
    }
}
