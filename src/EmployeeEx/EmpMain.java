package EmployeeEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {



    public static void main(String[] args) {


        List<Employee> employeeList1 = Arrays.asList(
                new Employee(3,"Jigar","IT",10000.00),
                new Employee(1,"Solanki","IT",12000),
                new Employee(4,"Jaya","IT",20000),
                new Employee(5,"Mani","Finance",8000),
                new Employee(2,"Jay","HR",13000.00),
                new Employee(6,"Lalu","Finance",7000.00));


        employeeList1.stream()
                .map(emp->
                {
                    if (emp.getDepartment().equals("IT")) {
                        double revisedSalary = emp.getSalary()+(emp.getSalary()*2/100);
                        emp.setSalary(revisedSalary);
                    }

                    return emp;

                }).forEach(System.out::println);


















        List<Integer> numbers = List.of(3,9,2,10,8,1,4,6,5);

        List<Integer> sortedOrder = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedOrder);

        List<Employee> employeeList = Arrays.asList(
                new Employee(3,"Jigar"),
                new Employee(1,"Solanki"),
                new Employee(4,"Jay"),
                new Employee(5,"Mani"),
                new Employee(2,"Jay"),
                new Employee(6,"Jigar"));

        Comparator<Employee> nameComparator = (employee1, employee2)-> employee1.getName().compareTo(employee2.getName());
        Comparator<Employee> IdComparator = (employee1, employee2)-> Integer.compare(employee1.getId(), employee2.getId());

        List<Employee> sortByNameWithCustomComparator = employeeList.stream().sorted(new NameComparator()).collect(Collectors.toList());
        List<Employee> sortByNameWithComparator1 = employeeList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        List<Employee> sortByNameWithComparator2 = employeeList.stream().sorted(nameComparator).collect(Collectors.toList());

        List<Employee> sortByNameAndId = employeeList.stream().sorted(nameComparator.thenComparing(IdComparator)).collect(Collectors.toList());

        //System.out.println(sortByNameWithCustomComparator);

        sortByNameAndId.forEach(System.out::println);


       /*// Collections.sort(employeeList,new IdComparator());
        Collections.reverse(employeeList);
        System.out.println(employeeList);

        Collections.sort(employeeList,new NameComparator());
        System.out.println(employeeList);*/
    }
}

/*
class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
*/
class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
