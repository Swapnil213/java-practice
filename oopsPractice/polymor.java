class add {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class childAdd extends add {
    public int add(int a, int b) {
        return a + b + 1;
    }
}
public class polymor {
    public static void main(String[] args) {
        childAdd a1 = new childAdd();

        //compile time polymorsphism
        System.out.println("when three var passed : " + a1.add(2, 3, 5));

        //runTime polymorphism called child class add method which add 1 to sum
        System.out.println("when two var passed(child wala add 1 to actual sum) : " + a1.add(1, 2));
    }
}
