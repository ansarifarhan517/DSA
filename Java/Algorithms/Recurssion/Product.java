public class Product {
    public static void main(String[] args) {
        System.out.println(printProduct(5));
    }

    static int printProduct(int n) {
        if (n == 0) {
            return 1;
        }
        return n * printProduct(n - 1);
    }
}
  

// 5 * 4 * 3 * 2 * 1