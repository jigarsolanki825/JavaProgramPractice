package JavaEightEx.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx //implements Predicate<Integer> {
{

/*    @Override
    public boolean test(Integer p) {

        if (p%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }*/

    public static void main(String[] args) {

        Predicate<Integer> predicate = p-> p % 2 == 0;

        List<Integer> integerList = Arrays.asList(1,2,3,5,6,4,8,7);
        //integerList.stream().filter(predicate).forEach(t -> System.out.println("Predicate interface even values: "+t));

        integerList.stream().filter(p-> p % 2 == 0).forEach(t -> System.out.println("Predicate interface even values: "+t));
    }

}
