import java.util.Scanner;

public class softound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Take size of array :");
        int size = sc.nextInt();
        int val = 1;
        int arr[][] = new int[size][size];

        int arr1 = 0;
        int arr2 = 0;
        int sol[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = val++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                sol[j][i] = arr[arr1][arr2++];
            }
            arr1++;
            arr2 = 0;
        }

        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                sol[i][j] = arr[i][j];
            }
        }

        arr1 = size / 2 - 1;
        arr2 = size / 2 - 1;
        for (int i = size / 2; i > size / 2 - 2; i--) {
            for (int j = size / 2 - 1; j < size / 2 + 1; j++) {
                sol[j][i] = arr[arr1][arr2++];
            }
            arr1++;
            arr2 = size / 2 - 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.err.print(sol[i][j] + "    ");
            }
            System.out.println();
        }

        sc.close();

    }
}
