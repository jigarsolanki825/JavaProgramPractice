package GeneralExamples;

import java.util.*;
import java.util.stream.Collectors;

public class ConcateList {

    public static void main(String[] args) {

   /*     List<Integer> l1 = List.of(1,2,3,4);
        List<Integer> l2 = List.of(5,6,7,8);

        List<List<Integer>> l3 = new ArrayList<>();
        l3.addAll(Collections.singleton(l1));
        l3.addAll(Collections.singleton(l2));

        //map - transformation
        //flatMap - flattering 2 into 1 ex. list

        List<Integer> l4 =l3.stream().flatMap(f->f.stream()).collect(Collectors.toList());
        System.out.println(l4);


    */

        Set list = new TreeSet();
        list.add(1.0);
        list.add(2L);
        list.add(3.0f);
        list.add("A");
        list.add(5);
        list.add(6);

      // list = new LinkedList<>();


        System.out.println(list);
    }
}
