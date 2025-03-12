public class ReverseOfNumber {

    public static void main(String[] args) {
        // System.out.println(reverseOfNum(123456789));
        System.out.println(CountStep(8, 0));
    }

    static int reverseOfNum(int n) {
        if (n == 0) {
            return 0;
        }
        int digits = (int) Math.log10(n) + 1;
        return (n % 10) * (int) Math.pow(10, digits - 1) + reverseOfNum(n / 10);
    }

    static int CountZero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return CountZero(n / 10, count + 1);
        } else {
            return CountZero(n / 10, count);
        }
    }

    static int CountStep(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return CountStep(n / 2, count + 1);
        } else {
            return CountStep(n - 1, count + 1);
        }
    }
}

// 1234 => 4321

// For Count zeros
// 101 => 1