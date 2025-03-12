public class fibonaciiUsingRecurrsion {
    public static void main(String[] args) {
        int result = fibo(4);
        System.out.println(result + "result");
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
