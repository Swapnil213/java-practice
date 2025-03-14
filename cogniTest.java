public class cogniTest {
    public static void main(String[] args) {

        // Cognizant Practice #1
        // to reverse the arr if sum of 1st half is less than second half (arr size is even)

        // int sum1 = 0;
        // int sum2 = 0;
        // int arr[] = { 100, 2, 3, 10, 20, 30 };
        // int size = arr.length;
        // int temp[] = new int[size];
        // int count = size;

        // for (int i = 0; i < size / 2; i++) {
        //     sum1 = sum1 + arr[i];
        //     sum2 = sum2 + arr[i + (size / 2)];
        // }

        // if (sum1 < sum2) {
        //     for (int i = 0; i < size; i++) {
        //         temp[--count] = arr[i];
        //     }
        // } else {
        //     for (int i = 0; i < size; i++) {
        //         temp[i] = arr[i];
        //     }
        // }

        // for (int i = 0; i < temp.length; i++) {
        //     System.out.println(temp[i]);
        // }

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #2
        // to reverse the arr if sum of 1st half is less than second half

        // int sum1 = 0;
        // int sum2 = 0;
        // int arr[] = { 1, 2, 30, 10, 20, 30, 40 };
        // int size = arr.length;
        // int half = size / 2;
        // int temp[] = new int[size];
        // int count = size;

        // if (size % 2 != 0) {
        //     half++;
        // }

        // for (int i = 0; i < half+ 1; i++) {
        //     sum1 = sum1 + arr[i];
        // }

        // for (int i = half+1; i < size; i++) {
        //     sum2 = sum2 + arr[i];
        // }

        // if (sum1 < sum2) {
        //     for (int i = 0; i < size; i++) {
        //         temp[--count] = arr[i];
        //     }
        // } else {
        //     for (int i = 0; i < size; i++) {
        //         temp[i] = arr[i];
        //     }
        // }

        // for (int i = 0; i < temp.length; i++) {
        //     System.out.println(temp[i]);
        // }

        // -------------------------------------------------------------------------------------------
        // Cognizant Practice #3
        // count subarrays of size 3 containing middle element sum of end elements

        // int arr[] = { 1, 2, 1, 3, 5, 2, 4, 2 };
        // int count = 0;

        // for (int i = 1; i < arr.length - 1; i++) {
        //     if (arr[i] == arr[i - 1] + arr[i + 1]) {
        //         count++;
        //     }
        // }
        
        // System.out.println(count);

    }
}
