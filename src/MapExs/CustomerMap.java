package MapExs;

import Product.Product;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CustomerMap {

    public static void main(String[] args) {

        Map<Integer,String> customerMap = new HashMap<>();
        customerMap.put(1,"Jigar");
        customerMap.put(2,"Solanki");
        customerMap.put(3,"Jay");
        customerMap.put(4,"Sir");
        customerMap.put(5,"BRC");

        Collections.synchronizedMap(customerMap);

        System.out.println(customerMap.get(2));
        System.out.println("\n =============+++++++===============");

        System.out.println(customerMap.size());
        System.out.println("\n =============+++++++===============");

        //System.out.println(customerMap.remove(5));

        System.out.println(customerMap.containsKey(3));
        System.out.println("\n =============+++++++===============");

        System.out.println(customerMap.containsKey(6));
        System.out.println("\n =============+++++++===============");

        System.out.println(customerMap.containsValue("BDQ"));
        System.out.println("\n =============+++++++===============");

        System.out.println(customerMap.containsValue("BRC"));
        System.out.println("\n =============+++++++===============");

        System.out.println(customerMap.replace(5,"AHM"));
        System.out.println("\n =============+++++++===============");

        customerMap.forEach((K,V)-> System.out.println(K+","+V));

        System.out.println(customerMap.entrySet());
        System.out.println("=============+++++++===============");

        List<String> mapValues = customerMap.entrySet().stream().map(j->j.getValue()).collect(Collectors.toList());
        mapValues.forEach(System.out::println);
        System.out.println("=============+++++++===============");

        customerMap.entrySet().stream().map(f->f.getKey()).forEach(System.out::println);
        System.out.println("=============+++++++===============");

        long count = customerMap.entrySet().size();
        System.out.println(count);
        System.out.println("=============+++++++===============");

        customerMap.entrySet().stream().map(m->m.getValue()).filter(s -> s.startsWith("J")).forEach(System.out::println);

        System.out.println("=============+++++++===============");

        Map<Integer,String> map = new HashMap<>();
        map.put(null,null);
        map.put(1,"J");
        map.put(2,"S");

        map.forEach((K,V) -> System.out.println(K + "," +V));

        System.out.println("=============+++++++===============");

        ConcurrentHashMap<Integer,String> h=new ConcurrentHashMap<>();
        h.put(100,"Stark");
        h.put(101,"Michale");
        h.put(102,"Ani");
        h.put(103,"Sofia");
        System.out.println(h);

        System.out.println("=============+++++++===============");

        System.out.println("=============+++++++===============");




    }

}

