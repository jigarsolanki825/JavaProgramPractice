package GeneralExamples;

import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

               /* int n = 10, firstTerm = 0, secondTerm = 1;
                System.out.println("Fibonacci Series till " + n + " terms:");

                for (int i = 1; i <= n; i++) {
                    System.out.println(firstTerm);

                    // compute the next term
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }*/

        System.out.println("Fibonacci Series using Java 8 Stream :- ");

        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) // 1. Iterate fibonacci number
                .limit(10) // 2. limit to 10 Integer numbers
                .map(n -> n[0]) // get 0th index from Arrays of size-2
                .forEach(fibNum -> System.out.println(fibNum)); // 3. print to console



    }
}
