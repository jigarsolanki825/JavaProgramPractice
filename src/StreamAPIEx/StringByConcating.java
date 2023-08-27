package StreamAPIEx;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringByConcating {

    public static void main(String[] args) {
/*
        List<String> stringList = List.of("Jigar","Solanki","Jay");

        String stringList1 = stringList.stream().collect(Collectors.joining("|"));
        System.out.println(stringList1);*/

       /* StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Jigar").append("$").append("Solanki").
                append("$").append("Jay").append("$");
        */

        StringJoiner stringJoiner = new StringJoiner("$");
        stringJoiner.add("Jigar").add("Solanki").add("Jay");
        System.out.println(stringJoiner);
    }
}
