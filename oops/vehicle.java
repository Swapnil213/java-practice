package oops;

abstract class Vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();

    abstract void brake();

    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// Concrete implementation (hidden details)
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
        // Hidden complex logic: fuel injection, gear shifting, etc.
    }

    @Override
    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}

public class vehicle {
    // Abstract class representing a Vehicle (hiding implementation details)
    public class Main {
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.startEngine();
            myCar.accelerate();
            myCar.brake();
        }
    }

}
