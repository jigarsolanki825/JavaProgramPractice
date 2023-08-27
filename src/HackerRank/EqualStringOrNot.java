package HackerRank;

import java.util.Scanner;

public class EqualStringOrNot {

    public static void main(String[] args) {

        String A = "madam";

        StringBuffer sb1 = new StringBuffer(A);
        sb1.reverse().toString();
        String result = sb1.equals(A) ? "Yes" : "No";

        System.out.println(result);
    }
}
