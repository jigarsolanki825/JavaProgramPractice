package JavaEightEx;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeEx1 {

    public static void main(String[] args) {
        List<Integer> lstInt = Arrays.asList(13,2,3,9,7,14,9,7);

        System.out.printf("================find int startWith 1 from list================\n");
        //Convert int to str
        lstInt.stream().map(s -> s + "").filter(sone -> sone.startsWith("1")).forEach(System.out::println);

        System.out.printf("================duplicate element from list===================\n");

        HashSet<Integer> hashSetInt = new HashSet<>();
        lstInt.stream().filter(s->!hashSetInt.add(s)).forEach(System.out::println);

        System.out.printf("================first element of the list===================\n");

        List<Integer> firstEleOfLst = lstInt.stream().findFirst().stream().collect(Collectors.toList());
        System.out.println(firstEleOfLst);

        System.out.printf("================find the total number of elements present===================\n");

        long presentEleOfLst = lstInt.stream().count();
        System.out.println(presentEleOfLst);

        System.out.printf("================find the maximum value element present in list===================\n");

        lstInt.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

        System.out.printf("================first non-repeated character===================\n");

        String s = "Java Hungry BlogH AliveJ is Awesome".toLowerCase();

        char[] c = s.toCharArray();
        Map<Character,Integer> nonRepeatedChar = new LinkedHashMap<>();

        for (char c1: c) {

            if (c1 != ' '){

                if (nonRepeatedChar.containsKey(c1)) {
                    nonRepeatedChar.put(c1,nonRepeatedChar.get(c1)+1);
                }
                else {
                    nonRepeatedChar.put(c1,1);
                }
            }

        }

        nonRepeatedChar.entrySet().forEach(System.out::println);
       Map.Entry nonRepeate = nonRepeatedChar.entrySet().stream().filter(e->e.getValue() == 1).findFirst().get();
        System.out.println(nonRepeate.getKey());
    }


}


/*
        System.out.println(s.length());

        for(Character ch:s.toCharArray()) {

            System.out.println("Last index : " + s.lastIndexOf(ch));
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }

        }*/
