package ErrorEx;

public class NoClassDefFoundErrorExample {
    public static void main(String args[]) {
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Audi");
        System.out.println("Make = " + vehicle.getMake());
    }
}