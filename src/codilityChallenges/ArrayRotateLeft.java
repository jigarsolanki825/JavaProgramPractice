package codilityChallenges;

import java.util.Arrays;

public class ArrayRotateLeft {

    public static void main(String[] args) {
        {
            ArrayRotateLeft rotate = new ArrayRotateLeft();

            int [] intArray = {3, 8, 9, 7, 6};
            System.out.println("Array before rotate : " + Arrays.toString(intArray));
            rotate.solution(intArray,3);
            System.out.println("Array after rotate : "+Arrays.toString(intArray));
        }
    }

    public int[] solution(int[] A, int times) {
        int k = 1;

        if (A.length <= 1) {
            return null; // No need to rotate for intArrays with 0 or 1 elements
        }

        while (k <= times){
            int firstElement = A[0];

            for (int i = 1; i <=A.length-1; i++) {
                A[i - 1] = A[i];
            }
            A[A.length-1] = firstElement;
            k++;
        }
        return A;
    }
}
//3, 8, 9, 7, 6
//8, 9, 7, 6, 3
//9, 7, 6, 3, 8
//7, 6, 3, 8, 9