public class variablearguments {
    static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers();                  // No argument
        printNumbers(5);                 // One argument
        printNumbers(1, 2, 3, 4, 5);     // Multiple arguments
    }
}
