import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        String name = "prxcode"; // String variable
        int age = 25; // Integer variable
        double price = 100.50;
        int a = 10; // Integer variable
        int b = 20; // Integer variable
        System.out.println("Hello, " + name + "!"); // Concatenating string with variable
        name = "bot";
        System.out.println("Hello, " + name + "!"); // Concatenating string with variable
        System.out.println(a+b); 
        //or
        int mul = a*b;
        int sum = a+b;
        System.out.print(sum + " and " + mul);
        // to input
        Scanner sc = new Scanner(System.in);
        String  car = sc.nextLine(); // next and nextLine are used to take input from user
        // nextInt()
        // nextFloat()
        // nextDouble()
        System.out.println(car);
         sc.close();

}
}
