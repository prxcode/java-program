public class increment {
    public static void main(String[] args) {
        int a = 5;
        int b = a++; // Post-increment: b gets the value of a, then a is incremented
        int c = ++a; // Pre-increment: a is incremented first, then c gets the new value of a
        
        System.out.println(b); // b = 5
        System.out.println(a); // a = 7
        System.out.println(c); // c = 7
    }
}