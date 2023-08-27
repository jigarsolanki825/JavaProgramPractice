package GeneralExamples;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final String age;

    public ImmutableClass(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

class A {

    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass(20,"Jigar","29");

        immutableClass.getAge();

     /*   immutableClass.setId(20);
        System.out.println(immutableClass);*/

    }
}