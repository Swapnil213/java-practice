public class ArithmeticUsingBit {
    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    
    static int sub(int a, int b) {
        return add(a, add(~b, 1));
    }

    static int mul(int a, int b) {
        int result = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    static int div(int a, int b) { //a is divident b is divisor
        int quotient = 0;
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                b = sub(a, b << i);
                quotient = quotient | (1 << i);
            }
        }
        return quotient;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println("Addition of " + a +" & "+ b + " is " + add(a, b));
        System.out.println("subtraction of " + a +" & "+ b + " is " + sub(a, b));
        System.out.println("Multiplication of " + a +" & "+ b + " is " + mul(a, b));
        System.out.println("Division of " + a + " & " + b + " is " + div(a, b));
    }
}
