import java.util.Scanner; //it is required to import for input user data like in python input is built-in function, age = int(input("Enter age: "))
// also note class name which is "conditions" here should always be same as <filename.java> 
// rest is similar to C lang
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
