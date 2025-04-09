import java.util.Scanner;

public class IBMpractice {

    static int FindHCF(int num1, int num2) {

        if (num1 == num2)
            return num1;

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        return num1;
    }
    
    static int GetFactorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * GetFactorial(num - 1);
        }
    }
    
    static int FindSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }

    static int GetBinary(int num) {
        int binary = 0;
        double count = 0;

        while (num > 0) {
            if (binary == 0) {
                binary = binary * 10 + num % 2;
                num = num / 2;
                count++;
            }
            binary = binary * 10 + num % 2;
            num = num / 2;
        }

        if (count != 0) {
            for (int i = 0; i < count; i++) {
                binary = binary * 10;
            }
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter numbers to find HCF : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println("HCF of "+ a + " & " + b + " is : " + FindHCF(a,b));

        // System.out.println("Enter number to find Factorial : ");
        // int a = sc.nextInt();

        // System.out.println("Factorial of "+ a + " is : "+ GetFactorial(a));

        // System.out.println("Enter number to find sum of its digits : ");
        // int a = sc.nextInt();

        // System.out.println("Sum of Digits in " + a + " is : "+ FindSumOfDigits(a));

        System.out.println("Enter number to find its Binary : ");
        int a = sc.nextInt();

        System.out.println("Factorial of "+ a + " is : "+ GetBinary(a));

        sc.close();
    }
}