package StreamAPIEx;

import java.util.Comparator;
import java.util.List;

public class FindSecondMax {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,7,8,6,9);
        integerList.stream().sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1).limit(1).forEach(System.out::println);
    }
}
