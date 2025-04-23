class parent {
    void printParent() {
        System.out.println("Parent Class");
    }

}
class child extends parent {
    void printChild() {
        System.out.println("Child Class");
        printParent();
    }
}
public class Inher {
    public static void main(String[] args) {
        child c1 = new child();
        c1.printChild();
        c1.printParent();
    }
}
