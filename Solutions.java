import java.util.Scanner;

public class Solutions {

    static boolean isPalindrome(String s1) {
        int length = s1.length();
        int end = length - 1;
        int start = 0;

        while (start < end) {
            char c1 = s1.charAt(start);
            char c2 = s1.charAt(end);
            if (c1 != c2) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (isPalindrome(name)) {
            System.out.println(name + " is a palindrome");
        }
        else {
            System.out.println(name + " is not a palindrome");
        }
        sc.close();
    }
}
