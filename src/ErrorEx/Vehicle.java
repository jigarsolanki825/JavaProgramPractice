package ErrorEx;

public class Vehicle {
        private String make;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void getVehicle() throws RuntimeException{
            System.out.println(this.make);
        }
    }

  /*  class Car extends Vehicle{

        @Override
        public void getVehicle() throws Exception {
            System.out.println("Child class");
        }
    }*/
