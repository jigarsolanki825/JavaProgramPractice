package HashMapEx;

import java.util.HashMap;
import java.util.Map;

public class charCountEx {

    public static void main(String[] args) {


    //India - I=2 times, n=1 time, d=1 time, a=1

    String name = "Jayapandiyan";
    char[] nameArray = name.toCharArray();

    HashMap<Character,Integer> letterCount = new HashMap<>();
        for (char c: nameArray) {
        if (letterCount.containsKey(c)) {
            Integer oldCount = letterCount.get(c);
            oldCount+=1;
            letterCount.put(c,oldCount);
        }
        else {
            letterCount.put(c, 1);
        }
    }

        //for (Map.Entry<Character,Integer> printMap: letterCount.entrySet()) {
        //System.out.println(printMap);

            System.out.print(letterCount.entrySet());
    }
}

