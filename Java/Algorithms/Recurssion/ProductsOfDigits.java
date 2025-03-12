public class ProductsOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigit(1234));

    }

    static int productOfDigit(int n) {
        if (n == 0) {
            return 1;
        }
        return n % 10 * productOfDigit(n / 10);
    }
}

// 1234 => 1 * 2 * 3 * 4 => 24