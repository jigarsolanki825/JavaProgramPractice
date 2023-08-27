package List;

import java.util.*;
import java.util.stream.Collectors;

public class ListExamples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> distinct = numbers.stream()
                .map(i -> i * i)
                .distinct()
                .filter(j -> j > 20)
                .filter(k -> k < 50)
                .collect(Collectors.toList());

        System.out.println(distinct);


        int maxNo = numbers.stream().mapToInt(j -> j).max().getAsInt();
        System.out.println(maxNo);

        numbers.stream().sorted().forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,6,2,8,3,7,4,5);

/*
        List<Integer> reverse = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }

        System.out.println("Reverse list : " + reverse);
*/

        List<Integer> reverseList = list.stream()
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("Reverse list : " +reverseList);


        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Int no: " +distinctIntList);



        List<Integer> intListOddEven = Arrays.asList(2, 4, 5, 6, 8);

        List<Integer> allEven = intListOddEven.stream().filter(i -> i % 2 == 0).filter(j -> j > 4).collect(Collectors.toList());
        List<Integer> oneEven = intListOddEven.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        List<Integer> noneMultipleOfThree = intListOddEven.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());



        System.out.println("AllEven : " + allEven);
        System.out.println(oneEven);
        System.out.println(noneMultipleOfThree);

        List<Integer> multiplyByThree = intListOddEven.stream().map(i -> i * 3).collect(Collectors.toList());

        System.out.println("multiplyByThree : "+multiplyByThree);

        List<Integer> reverseListEle = Arrays.asList(1, 2, 3, 4);
        List<Integer> reverseListEle1 =reverseListEle.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("reverseListEle" +reverseListEle1);


        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        List<String> collectAlpha = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collectAlpha);


    }



}





