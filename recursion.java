public class recursion {
    // public static void reverse(int n){
    //     if(n==0){
    //         return;
    //     }
    //         System.out.println(n);
    //         reverse(n-1);
    // }
    // public static void printSum(int i, int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }

    //     sum+=i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }
        // public static void printRec(int n, int res){
        //     if(n==1){
        //         res*=n;
        //         System.out.println(res);
        //         return;
        //     }
    
        //     res*=n;
        //     printRec(n-1, res);
        //     // System.out.println(i);
        // }
    public static int printRec(int n) {
        if(n==1||n==0){
            return 1;
        }
        
        int fac = n * printRec(n-1);
        return fac;
    }

    public static void main(String[] args) {
        int res = printRec(5);
        System.out.println(res);
    }
}
