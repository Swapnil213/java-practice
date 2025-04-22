package oops;

// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (Child) - Inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking!");
    }
}



public class Inheri {
        public static void main(String[] args) {
            Dog myDog = new Dog();

            // Inherited methods (from Animal)
            myDog.eat();
            myDog.sleep();

            // Child class method
            myDog.bark();
        }
}
