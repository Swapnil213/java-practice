package oops;

class Student {
    private int id;
    private String name;

    // Constructor for initialization
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method demonstrating parameter passing
    public void printStudent(String header) {
        System.out.println(header);
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        // Proper initialization
        Student obj = new Student(28, "Geek");
        // Method with parameter
        obj.printStudent("Student Details:");
    }
}
