import java.util.HashSet;
import java.util.Scanner;

public class Leet15 {
    public static int numSquareSum(int n) {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }

    static boolean isHappyNumber(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isHappyNumber(n)) {
            System.out.println(n + " is a Happy Number");
        }
        else {
            System.out.println(n + " is not a Happy Number");
        }
        sc.close();
   } 
}
