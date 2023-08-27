package MapExs;

import java.util.HashMap;
import java.util.Map;

public class RomanMap {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToValue = new HashMap<>();
        romanToValue.put('I', 1);
        romanToValue.put('V', 5);
        romanToValue.put('X', 10);
        romanToValue.put('L', 50);
        romanToValue.put('C', 100);
        romanToValue.put('D', 500);
        romanToValue.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanToValue.get(s.charAt(i));
            if (value >= prevValue) {
                total += value;
            } else {
                total -= value;
            }
            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] romanNumerals = {"III", "LVIII", "MCMXCIV"};
        for (String numeral : romanNumerals) {
            int integer = romanToInt(numeral);
            System.out.println("Roman numeral " + numeral + " converted to integer: " + integer);
        }
    }
    }
