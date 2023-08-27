package GeneralExamples;

import java.util.Arrays;

public class ArraySumPairs {

        public static int[] calculateSums(int[] input) {
            return Arrays
                    .stream(input)
                    .filter(i -> i % 2 == 0)  // Take even indexed elements
                    .map(i -> input[i] + input[i + 1])  // Sum adjacent elements
                    .toArray();
        }

    public static void main(String[] args) {
        int[] input = {1, 6, 8, 5, 9, 4, 7, 2};
        int[] output = calculateSums(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
    }
}
