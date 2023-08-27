package student.ex;

import java.util.*;

public class Student {

    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", marks=" + marks +
                '}';
    }



    public static void main(String[] args) {

        Student student1 =new Student("Jay",List.of(100,90,96,85,90));
        Student student2 =new Student("Jigar",List.of(70,80,96,77,90));
        Student student3 =new Student("Solanki",List.of(76,90,70,85,88));
        Student student4 =new Student("Lalu",List.of(99,100,100,100,95));


        //find student based on highest total marks

        List<Student> studentList= Arrays.asList(student1,student2,student3,student4);


        studentList.stream()
                .max(Comparator.comparingInt(student -> student.getMarks()
                       // .stream().mapToInt(Integer::intValue).sum()))
                        .stream().reduce(Integer::sum).get())).stream().forEach(System.out::println);

    }




}
