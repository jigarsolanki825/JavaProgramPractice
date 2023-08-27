package codilityChallenges;


import java.util.Arrays;

class ArrayRotateRight {

    public static void main(String[] args) {
        {
            ArrayRotateRight rotate = new ArrayRotateRight();

            int [] intArray = {3, 8, 9, 7, 6};
            System.out.println("Array before rotate : " +Arrays.toString(intArray));
            rotate.solution(intArray,3);
            System.out.println("Array after rotate : "+Arrays.toString(intArray));
        }
    }

    public int[] solution(int[] A, int K) {

            if (A.length <= 1) {
                return null; // No need to rotate for intArrays with 0 or 1 elements
            }

            for(int times = 1; times<=K; times++){
            int lastElement = A[A.length - 1];

            // Shift elements to the right //3, 8, 9, 7, 6
                                          //6, 3, 8, 9, 7
                                         //7, 6, 3, 8, 9
                                        //9, 7, 6, 3, 8
            for (int i = A.length - 2; i >= 0; i--) {
                A[i + 1] = A[i];
            }

            A[0] = lastElement;

            }

            return A;
        //System.out.println(Arrays.toString(A));
}}
