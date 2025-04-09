import java.util.Scanner;

public class IBMpractice {

    static int FindHCF(int num1, int num2) {
        
        if (num1 == num2)
            return num1;

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to find HCF : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("HCF of "+ a + " & " + b + " is : " + FindHCF(a,b));


        sc.close();
    }
}