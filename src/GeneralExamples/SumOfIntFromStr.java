package GeneralExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SumOfIntFromStr {
    public static int sumOfIntegers(String str) {
        Pattern pattern = Pattern.compile("\\D"); // Non-digit pattern

        return Stream.of(pattern.split(str))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }


    public static void main(String[] args) {
        System.out.println(sumOfIntegers("1a2b3c"));                // Output: 6
        System.out.println(sumOfIntegers("123ab!45c"));            // Output: 168
        System.out.println(sumOfIntegers("abcdef"));               // Output: 0
        System.out.println(sumOfIntegers("0123.4"));               // Output: 127
        System.out.println(sumOfIntegers("dFD$#23+++12@#T1234;/.,10")); // Output: 1279
    }
    }
