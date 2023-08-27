package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStreamEx {

    private static int age;
    private int id;

    public static void main(String[] args) {

       // id = 21;
        age =20;
        System.out.println("================EvenNumbers============");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 0, 9, 8, 7, 6, 5);

        List<Integer> evenNums = list.stream().filter(evn -> evn % 2 == 0).collect(Collectors.toList());

        evenNums.forEach(System.out::println);

        System.out.println("================Size Greater than 5===================");

        List<String> stringsList = Arrays.asList("Jigar", "Solanki", "Trushu", "Rajput", "Bapu");

        List<String> stringsWithSize = stringsList.stream().filter(ss -> ss.length() > 5).collect(Collectors.toList());

        stringsWithSize.forEach(System.out::println);

        System.out.println("================String starts with JT===================");

        List<String> strings = Arrays.asList("JTigar", "Solanki", "JTrushu", "jtRajput", "Bapu");

        List<String> jtStringsList = strings.stream().filter(jt -> jt.startsWith("JT")).collect(Collectors.toList());
        jtStringsList.forEach(System.out::println);


        System.out.println("================PersonAge===================");


        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 30), new Person("Bob", 20), new Person("Jane", 35));

        List<String> listOfName = new ArrayList<>();

           List<Person> personList = people.stream().filter(person -> person.getAge()>20).collect(Collectors.toList());
           personList.forEach(person -> {
               listOfName.add(person.getName());

           });

        System.out.println(listOfName);


        List<String> words = Arrays.asList("apple", "banana", "car", "dog", "elephant");
        Predicate<String> predicate = s -> s.length() == 3 && s.contains("a");
        List<String> filteredWords = words.stream()
                .filter(fruitNames -> predicate.test(fruitNames))
                .filter(predicate)
                .filter(s -> s.length() == 3 && s.contains("a"))
                //.filter(name->testName(name))
                .collect(Collectors.toList());
        System.out.println(filteredWords); // Output: [apple, banana, elephant]



    }


    private void getName(){
        List<String> words = Arrays.asList("apple", "banana", "car", "dog", "elephant");
        Predicate<String> predicate = s -> s.length() == 3 && s.contains("a");
        List<String> filteredWords = words.stream()
                .filter(fruitNames -> predicate.test(fruitNames))
                .filter(predicate)
                .filter(s -> s.length() == 3 && s.contains("a"))
                //.filter(this::testName)
                .collect(Collectors.toList());
    }

    private static boolean testName(String name){

        return name.equalsIgnoreCase("Air plane");

    }



}

class Person{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


