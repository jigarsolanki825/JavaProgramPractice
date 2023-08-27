package JavaEightEx.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {

     /*   Consumer<Integer> consumer = t -> System.out.println("Consumer interface value: "+t);
        consumer.accept(10);*/

        List<Integer> integerList = Arrays.asList(1,2,3,5,6,4,8,7);
        integerList.stream().forEach(t -> System.out.println("Consumer interface values: "+t));
    }
}
