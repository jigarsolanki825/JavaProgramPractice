package List;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx extends Object{

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class.forName("HashMapEx").newInstance();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);


        list.add(3,8);
        list.remove(3);
        for (int l:list)
        {
            System.out.println(l);
        }

        System.out.println(list.size());

        System.out.println("Retrive element from 3rd Index: "+list.get(3));

        System.out.println(list.indexOf(4));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf(2));
        System.out.println(list.contains(3));
        //System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list);

        list.set(3,44);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());



    }
}
