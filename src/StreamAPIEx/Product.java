package StreamAPIEx;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Product {
// Create map will be unique no and values product object
    //convert list to map using java 8
    //{1,Product},{2,Product} id and details








    int num;
    String name;
    double price;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int num, String name, double price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList< Product >();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000.03));
        productsList.add(new Product(2, "Dell Laptop", 30000.33));
        productsList.add(new Product(3, "Lenevo Laptop", 28000.42));
        productsList.add(new Product(4, "Sony Laptop", 28000.22));
        productsList.add(new Product(5, "Apple Laptop", 90000.16));
        productsList.add(new Product(6, "HP Laptop", 24000.16));
        productsList.add(new Product(7, "HP Laptop", 23000.12));



        productsList.stream().filter(product -> product.getPrice() < 29999.99).forEach(System.out::println);

        System.out.println("===================================");

        productsList.stream().filter(product -> product.getName() == "HP Laptop").forEach(System.out::println);

        System.out.println("===================================");

        productsList.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        System.out.println("===================================");

        productsList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);

        System.out.println("===================================");

        List<Product> minPrice = productsList.stream().min(Comparator.comparing(Product::getPrice)).stream().collect(Collectors.toList());
        System.out.println(minPrice);
        System.out.println("===================================");

        List<Product> maxPrice = productsList.stream().max(Comparator.comparing(Product::getPrice)).stream().collect(Collectors.toList());
        System.out.println(maxPrice);

        System.out.println("===================================");

        productsList.stream().filter(product -> product.getName() == "HP Laptop").forEach(System.out::println);

        System.out.println("===================================");

        Map<Integer,Product> productMap = productsList.stream().collect(Collectors.toMap(Product::getNum,Function.identity()));
        productMap.forEach((K,V) -> System.out.println("{"+K+"," +V+"}"));

        System.out.println("===================================");

        System.out.println("===================================");

        System.out.println("===================================");

        System.out.println("===================================");



    }
}
