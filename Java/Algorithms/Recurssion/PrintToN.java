public class PrintToN {
    public static void main(String[] args) {
        // printToN(5);
        printToNAsc(5);
    }

    static void printToN(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printToN(n - 1);
    }

    static void printToNAsc(int n) {
        if (n == 0) {
            return;
        }
        printToNAsc(n - 1);
        System.out.println(n);
    }
}

// Formula
// print(n) = n - (n - 1)
