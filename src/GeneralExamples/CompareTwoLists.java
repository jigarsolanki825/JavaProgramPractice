package GeneralExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareTwoLists {

    public static void main(String[] args) {

        // list 1
        List<String> list1 = new ArrayList<String>();
        list1.add("compare");
        list1.add("two");
        list1.add("lists");
        list1.add("in java 8");

        // list 2
        List<String> list2 = new ArrayList<String>();
        list2.add("compare");
        list2.add("two");
        list2.add("lists");
        list2.add("in java 8");


        boolean isListsAreEquals = list1.equals(list2);

        System.out.println("Is lists are equals: " +isListsAreEquals);

        List<String> isListSame = list1.stream().filter(l1 -> (list2.stream().filter(l2 -> l2.equals(l1)).count()) < 1).collect(Collectors.toList());

        if(isListSame.size() < 1) {
            System.out.println("Lists are same");
        }
        else
            System.out.println("Lists are not same");

    }
}
