package InheritanceEx;
 class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void makeSound() {
            System.out.println("Animal makes a sound.");
        }
    }

    // Child class (subclass) inheriting from Animal
    class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        // Overriding the makeSound method from the parent class
        @Override
        void makeSound() {
            System.out.println("Dog barks: Woof! Woof!");
        }

        // Additional method specific to the Dog class
        void wagTail() {
            System.out.println("Dog wags its tail.");
        }
    }

    public class InheritanceEx {
        public static void main(String[] args) {
            // Create an instance of the Dog class
/*            Dog myDog = new Dog("Buddy");

            // Call methods on the Dog instance
            System.out.println("Name of the dog: " + myDog.name);
            myDog.makeSound();
            myDog.wagTail();*/

          /*  Animal animal = new Dog("Rocky");
            System.out.println("Name of the dog: " + animal.name);*/

            Animal animal = new Animal("doggy");
            animal.makeSound();
        }
    }

