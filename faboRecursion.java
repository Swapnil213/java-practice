public class faboRecursion {
    // public static void faboPrint(int one, int two , int limit) {
    //     if(limit>10){
    //         System.out.println(one);
    //         System.out.println(two);
    //         return;
    //     }
    //     System.out.println(one);
    //     int temp = two;
    //     two = one + two;
    //     one = temp;
    //     faboPrint(one, two, limit+1); 
    // }
    public static void faboPrint(int a, int b , int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        faboPrint(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, n = 5 ;
        System.out.println(a);
        System.out.println(b);
        faboPrint(a,b,n);
    }
}
