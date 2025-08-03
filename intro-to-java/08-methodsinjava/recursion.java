public class recursion {
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);  // 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Factorial of 5 is: " + result);
    }
}
