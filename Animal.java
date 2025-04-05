class Ani {
   private String name;
    
    Ani(String name) {
        this.name = name;
        System.out.println(name + " is making sound.");
    }
}

class Dog extends Ani {
    Dog(String name) {
        super(name);
    }
}

public class Animal {
    public static void main(String[] args) {
        new Dog("sheru");
        // d.display();
    }
}
