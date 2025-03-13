import java.util.Scanner;

public class wiprotext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int count = 0;

        // for (int i = 1; i < n; i++) {
        // if (String.valueOf(i).length() % 2 == 1) {
        // System.out.print(i + " ");
        // System.out.println(String.valueOf(i).length() % 2);
        // }
        // }

        // System.out.println(9);

        // int p = sc.nextInt();
        // int r = sc.nextInt();
        // int n = sc.nextInt();

        // long ca = p;
        // int mul = (100 + r);

        // for (int i = 0; i < n; i++) {
        // ca = (ca * mul) / 100;
        // }

        // System.out.println(ca);

        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // int min;

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // min = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (min > arr[i]) {
        // min = arr[i];
        // }
        // }

        // System.out.println(min);

        // int n = sc.nextInt();
        // int size = 0;
        // int arr[] = new int[n];
        // int sol[] = new int[size];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // double sqrt = Math.sqrt(arr[i]);
        // if (sqrt == (int) sqrt) {
        // sol[size++] = (int) sqrt;
        // }
        // }

        // for (int i = 0; i < sol.length -1; i++) {
        // System.out.print(sol[i] + " ");
        // }

        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // // int j = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // if (n == 0) {
        //     System.out.println(0);
        // }
        
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] != arr[j]) {
        //         j++;
        //         arr[j] = arr[i];
        //     }
        // }

        // // System.out.println(arr);
        // System.out.println(j + 1);
        

        // int product = 0;
        // for (int i = 0; i < arr.length -1 ; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         int mul = arr[i] * arr[j];
        //         if (product < mul) {
        //             product = mul;
        //         }
        //     }
        // }

        // System.out.println(product);

        // String s = sc.nextLine();
        // String r = "";

        // for (int i = s.length() - 1; i >= 0 ; i--) {
        //     r = r + s.charAt(i);
        // }

        // System.out.println(r);

        // sc.close();

        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder r = new StringBuilder();
         
        for (String word : words) {
            r.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(r.toString().trim());
    }
}
