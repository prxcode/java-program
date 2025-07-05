import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner is used to take input from the user
        int age = sc.nextInt(); // Taking age as input from user

        if (age > 18) { // If age is greater than 18
            System.out.println("Adult");
        } else {
            System.out.println("Not an adult");
        }
    }
}
