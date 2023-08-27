package StringExamples;

public class FirstNonRepeatedCharInString {

    public static void main(String[] args) {
        String inputStr = "JigarSolankiJ";

        /*for (char i : inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                break;

            }
        }*/

        char firstNonRepeated = inputStr.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> inputStr.indexOf(c) == inputStr.lastIndexOf(c))
                .findFirst().orElse('\0');

        System.out.println(firstNonRepeated);
    }
}