package Comparator;

import java.util.*;


public class EmployeeDataProcess {


    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(4,"Jigar",10000.00),new Employee(2,"Solanki",9500.00),
                                                  new Employee(3,"Jay",8499.99), new Employee(1,"Mani",11999.99));

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        employeeList.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++");
        Integer[] array = {1,4,7,3,9,2};
        Arrays.sort(array);

        for (int arr: array) {
            System.out.println(arr);
        }


        employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).forEach(System.out::println);
        System.out.println("============================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("============================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
        System.out.println("============================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).forEach(System.out::println);
        System.out.println("============================");




    }
}
