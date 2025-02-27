import java.util.*;

public class functions {
    public static void printAverage(int a , int b , int c)
    {
        System.out.println((a+b+c)/3);
    }
    public static void printSumOfOdd(int n)
    {
        if(n<0)
        {
            System.out.println("n should be positive just like ur thoughts");
            return;
        }
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            int a = sc.nextInt();
        }

    } 
}
