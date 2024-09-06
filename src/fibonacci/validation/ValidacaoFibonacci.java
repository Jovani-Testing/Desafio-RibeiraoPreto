package fibonacci.validation;

public class ValidacaoFibonacci {


    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b == num;
    }

    public static void main(String[] args) {
        // ...
    }
}
