package LeetCodeChallenges;

public class RepeatedSubstringPattern {

    public void repeatedSubstringPattern(String s) {
        String concat = s + s;
        String res = concat.substring(1, concat.length() -1);
        System.out.println(res.contains(s));
    }

    public static void main(String[] args) {

        RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
        String s = "abcababc";
        pattern.repeatedSubstringPattern(s);

    }
}
