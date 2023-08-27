package List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayMatchingElements {

    public static void main(String[] args) {

        //find the 2nd maximum

       /* List<Integer> numbers = List.of(10, 5, 20, 15, 30, 25);


        Integer max = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()).get(0);

        System.out.println(max);*/

        //sort in decending order
        //find no matched elements from two arrays

        /*Integer[] arrInt1 = {1,2,3,4,5,6};
        Integer[] arrInt2 = {3,4,5,5,6,7};

        List<Integer> list1 = List.of(arrInt1);
        List<Integer> list2 = List.of(arrInt2);

        list1.stream().distinct();
        System.out.println(list1);
        System.out.println(list2);
*/
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(3,4,5,6,7);


        List<Integer> l1NonMatchElements = list1.stream().filter(l1-> !list2.contains(l1)).collect(Collectors.toList());

        List<Integer> l2NonMatchElements = list2.stream().filter(l2-> !list1.contains(l2)).collect(Collectors.toList());

        List<Integer> nonMatchedElements = new ArrayList<>(l1NonMatchElements);
        //nonMatchedElements.addAll(l1NonMatchElements);
        nonMatchedElements.addAll(l2NonMatchElements);

        System.out.println(nonMatchedElements);





    //India - I=2 times, n=1 time, d=1 time, a=1

        String name = "Jayapandiyan";
        char[] nameArray = name.toCharArray();

        HashMap<Character,Integer> letterCount = new HashMap<>();
        for (char c: nameArray) {
            if (letterCount.containsKey(c)) {
               Integer oldCount = letterCount.get(c);
               oldCount+=1;
               letterCount.put(c,oldCount);
            }
            else {
                letterCount.put(c, 1);
            }
        }

        for (Map.Entry<Character,Integer> printMap: letterCount.entrySet()) {
            System.out.println(printMap);
        }








//        List<Integer> commonElements1 = list2.stream().filter(list1::contains).collect(Collectors.toList());

  //      System.out.println(commonElements1);

     /*   Set<Integer> common = new HashSet<>();
        list1.stream().forEach(ls1 -> {
            if(!list2.contains(ls1)){
                common.add(ls1);
            }
            list2.forEach(ls2 -> {
                if(ls2 != ls1){
                    common.add(ls2);
                }
            });
        });
        System.out.println(common);*/


        //int secondMax = list1.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()).get(0);
        //System.out.println(secondMax);
       // List<Integer> list2 = List.of(3,4,5,6,7);

        /*Integer[] arrInt1 = {1,2,3,4,5,6};
        Integer[] arrInt2 = {3,4,5,5,6,7};

        List<Integer> commonElements1 = Stream.of(arrInt1)
                .collect(Collectors.toList())
                .stream()
                .filter(int1 -> Stream.of(arrInt2).collect(Collectors.toList())
                        .contains(int1)).collect(Collectors.toList());
      //          box().filter(int1-> Stream.of(arrInt2).filter(int2 -> ));

        List<Integer> commonElements = list2.stream().filter(lst -> list1.contains(lst)).collect(Collectors.toList());
        System.out.println(commonElements1);*/


    }
}
