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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check palindrome");
        String name = sc.nextLine();
        if (isPalindrome(name)) {
            System.out.println(name + " is a palindrome");
        }
        else {
            System.out.println(name + " is not a palindrome");
        }

        System.out.println("Enter Strings to check Anagram");

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " & " + s2 + " are Anagram");
        }
        else {
            System.out.println(s1 + " & " + s2 + " are not Anagram");
        }

        sc.close();
    }
}
