class pattern{
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     for(int j = 1; j < i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j < i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = n-i+1; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 4 ;
        // for (int i = 0; i <= n; i++) {
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }
        //     for(int j = 0; j < n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j < n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 0; i--) {
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }
        //     for(int j = 0; j < n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j < n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for (int i = 0; i < 5; i++) {
        //     for(int j = 0; j< n-i-1; j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j = 0; j< n; j++){
        //         if (i==0||i==n-1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n-i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}