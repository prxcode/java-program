public class methods {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        methods obj = new methods();
        int result = obj.add(10, 20);
        System.out.println("Sum is: " + result);
    }
}
