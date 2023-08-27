/*
package HashMapEx;

import Comparator.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapExamples {
    public static void main(String[] args) {

       // List<Integer> list = new ArrayList<>();
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        Collections.unmodifiableList(list);
        list.add(2);
        list.add(0,3);
        System.out.println(list);
        for (int i : list) {
            list.add(0,4);
        }


        Student s1 =new Employee(100,"jigar");

        Map<Employee,String> stringHashMap = new HashMap<>();
        stringHashMap.put(s1,"CE");
        stringHashMap.put(new Employee(101,"Solanki"),"EC");
        stringHashMap.put(new Employee(101,"Solanki"),"ME");

        stringHashMap.remove(s1);

        System.out.println(stringHashMap);

        stringHashMap = new ConcurrentHashMap<>();


}









*/
/*Set<Comparator.Employee> hashSet = new HashSet<>();

        hashSet.add(new Comparator.Employee(1,"Jigar"));
        hashSet.add(new Comparator.Employee(1,"Jigar"));
        hashSet.add(null);
        System.out.println(hashSet);*//*
*/
/*


       *//*

*/
/* Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(11);
        System.out.println(set);
        *//*
*/
/*


        Hashtable hashtable = null;
        ConcurrentHashMap concurrentHashMap = null;


    }



*//*

*/
/*class Employee{

    int sid;
    String name;

    public Employee(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

*//*
*/
/*
*//*

*/
/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comparator.Employee)) return false;
        Comparator.Employee student = (Comparator.Employee) o;
        return getSid() == student.getSid() && getName().equals(student.getName());
    }*//*
*/
/*
*//*

*/
/*

   *//*
*/
/*
*//*

*/
/* @Override
    public int hashCode() {
        return Objects.hash(getSid(), getName());
    }*//*
*/
/*
*//*

*/
/*

   *//*
*/
/*
*//*

*/
/* @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + sid;
        return result;
    }
*//*
*/
/*
*//*

*/
/*
    @Override
    public String toString() {
        return "Comparator.Employee{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }*//*
*/
/*

*/
