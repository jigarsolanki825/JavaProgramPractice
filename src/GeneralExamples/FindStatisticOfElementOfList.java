package GeneralExamples;

import java.util.ArrayList;
import java.util.List;

public class FindStatisticOfElementOfList {

    public static void main(String[] args) {

        List<Integer> myCoords = new ArrayList<Integer>();

        myCoords.add(20);
        myCoords.add(30);
        myCoords.add(70);
        myCoords.add(10);
        myCoords.add(80);
        myCoords.add(40);
        myCoords.add(60);
        myCoords.add(90);
        myCoords.add(50);
        myCoords.add(100);

        ArrayList<Integer> myCoords1 = new ArrayList<Integer>(myCoords);


        myCoords.forEach(System.out::println);


        System.out.println("\n");
        System.out.println("\n");


        int maxElementOfList = myCoords.stream().mapToInt(i->i).max().getAsInt();
        System.out.println("\n max Element Of List : " +maxElementOfList);

        int minElementOfList = myCoords.stream().mapToInt(i->i).min().getAsInt();
        System.out.println("\n min Element Of List : " +minElementOfList);

        double avgElementOfList = myCoords.stream().mapToInt(i->i).average().getAsDouble();
        System.out.println("\n avg Element Of List : " +avgElementOfList);


    }
}
