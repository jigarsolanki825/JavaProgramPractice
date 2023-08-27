package JavaEightEx.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier don't have arguments it has return type only
public class SupplierEx {

    public static void main(String[] args) {

      //  Supplier<String> supplier = ()-> "Hi there, this is supplier interface";

        //System.out.println(supplier.get());

        //List<String> integerList = Arrays.asList("a","b","c");

        List<String> integerList = Arrays.asList();

        // System.out.println(integerList.stream().findAny().orElseGet(supplier));
        System.out.println(integerList.stream()
                .findAny().orElseGet(()-> "Hi there, this is supplier interface"));

    }
}
