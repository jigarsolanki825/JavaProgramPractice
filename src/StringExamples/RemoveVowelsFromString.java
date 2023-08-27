package StringExamples;

public class RemoveVowelsFromString {

    public static void main(String[] args) {

        String s = "preEpiInAsta";
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowel : "+s1);
    }

}
