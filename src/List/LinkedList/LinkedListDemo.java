package List.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(8);
        numbers.add(5);
        numbers.add(4);
        System.out.println(numbers);

        numbers.add(5,10);

        System.out.println("Add element at 5th index: "+numbers);

        numbers.addFirst(11);

        System.out.println(numbers);

        numbers.addLast(33);

        System.out.println(numbers);

        numbers.remove(6);

        numbers.set(0,11);

        System.out.println(numbers);

        boolean num = numbers.contains(22);

        System.out.println(num);


    }
}
