package StreamAPIEx;

import java.util.Comparator;
import java.util.List;

public class OperationOnIntNum {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,7,8,6,9);

        Integer sum = integerList.stream()
                                 .mapToInt(Integer::intValue)
                                 .sum();
        System.out.println(sum);

        Integer sum1 =integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of num: "+sum1);

        integerList.stream().max(Comparator.comparing(Integer::intValue)).stream().forEach(System.out::println);

        integerList.stream().mapToInt(Integer::intValue).max().stream().forEach(System.out::println);

        double avg = integerList.stream().mapToInt(i->i.intValue()).average().getAsDouble();

        System.out.println(avg);

       Integer minVal = integerList.stream().mapToInt(Integer::intValue).min().getAsInt();
       System.out.println(minVal);

       integerList.stream().filter(i->i%2==0).forEach(System.out::println);



    }
}
