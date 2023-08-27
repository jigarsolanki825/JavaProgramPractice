package JavaEightEx.FunctionalInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Function in functional interface type Takes an argument of one type and returns a result of another type
public class FunctionEx {


    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("1","2","3","4");

        // Using a Function to convert each string element to an integer

        stringList.stream().map(Integer::parseInt).forEach(System.out::println);

        /*Function<String, Integer> stringToInt = Integer::parseInt;
        List<Integer> integerList = convertList(stringList, stringToInt);

        // Printing the converted integer list
        System.out.println("Original list of strings: " + stringList);
        System.out.println("Converted list of integers: " + integerList);
    }

    public static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T item : list) {
            resultList.add(function.apply(item));
        }
        return resultList;
    }*/
}
}
