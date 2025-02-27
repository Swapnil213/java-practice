public class calPow {
    public static int calPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==1){
            return x;
        }

        int res = x * calPower(x, n-1);
        return res;
    }
    public static void main(String[] args) {
        int res = calPower(2,5);
        System.out.println(res);
    }
}
