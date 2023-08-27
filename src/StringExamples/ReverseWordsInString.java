package StringExamples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str= "Let's take LeetCode contest";
   /*     StringBuffer sb;

        String [] splitStrings = str.split(" ");


        for(String strArrays : splitStrings){

            sb =new StringBuffer(strArrays);
            sb.reverse();

            System.out.print(sb+" ");
        }*/

        String reverseWordStr = Arrays.stream(str.split(" "))
                                .map(str1 -> new StringBuilder(str1).reverse())
                                .collect(Collectors.joining(" "));
        System.out.println(reverseWordStr);



    }
}

//"s'teL ekat edoCteeL tsetnoc"
