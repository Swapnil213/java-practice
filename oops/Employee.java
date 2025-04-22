package oops;

public class Employee {
    // Instance variables (non-static)
    private String name;
    private float salary;

    // Constructor
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    // getters method
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    // setters method
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Instance method
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Geek", 10000.0f);
        emp.displayDetails();
    }
}
