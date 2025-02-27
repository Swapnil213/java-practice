public class permutation {
    //permutations of given string 

    public static void printPerm(String str, String permString) {
        if(str.length()==0){
            System.out.println(permString);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String sub = str.substring(0, i)+str.substring(i+1);
            printPerm(sub, permString+curChar);
        }
        
    }


    /*backtracking total paths in a maze */
    // public static int TotalPaths(int n, int m, int i, int j) {
    //     if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     //move down
    //     int down = TotalPaths(n, m, i+1, j);

    //     //move right
    //     int right = TotalPaths(n, m, i, j+1);

    //     return down+right;
    // }

    // public static int TotalPlacements(int n, int m) {
    //     if(n == m){
    //         return 2;
    //     }
    //     if(n<m){
    //         return 1;
    //     }

    //     //vertical [placements]
    //     int vert = TotalPlacements(n-m, m);
    //     //horizontal placements
    //     int hori = TotalPlacements(n-1, m);
    //     return vert + hori;
    // }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str,"");
        // int n=3, m=4;
        // int total = TotalPaths(n,m,0,0);
        // System.out.println(total);
        // int n = 6, m = 2;
        // System.out.println(TotalPlacements(n, m));
    }
}
