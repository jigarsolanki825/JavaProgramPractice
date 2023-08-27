package ExceptionEx;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
