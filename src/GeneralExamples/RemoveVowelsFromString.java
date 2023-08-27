package GeneralExamples;

public class RemoveVowelsFromString {

    public static void main(String[] args) {

        String s = "prep inst agramaccount ";
        String finalStr = "";
        finalStr = s.replaceAll("[aeiou]", "").trim();
        System.out.println("String after removing vowel : "+finalStr);

        finalStr = s.replace(" ", "");
        System.out.println("String after removing vowel : "+finalStr);
    }

}
