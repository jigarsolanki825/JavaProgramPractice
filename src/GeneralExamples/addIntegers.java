package GeneralExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class addIntegers {

    public static void main(String[] args) {
       // System.out.println(getSum("1a2b3c"));
        System.out.println(getSum("a1b22v332" ));
    }
    public static int getSum(String str){
        //Character.isDigit(ch) -> true or false
        //int val =  ch - '0' ('7' - '0') = 7
        //a1b22v332 |1|22|332
        int sum = 0;
        String temp = "";

        for (int i=0; i< str.length();i++){

            if(Character.isDigit(str.charAt(i))){

                temp = temp + Character.getNumericValue(str.charAt(i));
            }
            else if(Character.isAlphabetic(str.charAt(i)))
            {
                temp = "|";
            }

            System.out.print(temp);
        }

        return sum;
    }
}
