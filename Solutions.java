import java.util.Arrays;
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

    static boolean isAnagram(String a, String b) {
        char ar[] = a.toCharArray();
        char br[] = b.toCharArray();

        int len1 = ar.length;
        int len2 = br.length;

        if (len1 != len2) {
            return false;
        }

        Arrays.sort(ar);
        Arrays.sort(br);

        for (int i = 0; i < br.length; i++) {
            if (ar[i] != br[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check palindrome");
        String name = sc.nextLine();
        if (isPalindrome(name)) {
            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }

        System.out.println("Enter Strings to check Anagram");

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " & " + s2 + " are Anagram");
        } else {
            System.out.println(s1 + " & " + s2 + " are not Anagram");
        }

        printFibonacciSequence(10);

        System.out.println();

        int length = 10;

        System.out.print("A Fibonacci sequence of " + length + " numbers: ");

        for (int i = 0; i < length; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        System.out.println(removeWhiteSpaces("I am a Student"));

        System.out.println(factorial(10));

        sc.close();
    }
}
