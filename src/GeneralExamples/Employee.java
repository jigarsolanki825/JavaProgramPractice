package GeneralExamples;

public class Employee {

    private int id;
    private String name;
    private String department;

    private String salary = "100000";

    private Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private Employee(int id, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private Employee(String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private Employee(int id) {
        this.id = id;
    }


}
