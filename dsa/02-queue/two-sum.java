import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Sum of two numbers");
        System.out.print("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum is: "+(num1+num2));
    }
}
