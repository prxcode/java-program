
// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.Scanner; 

public class starsquestion {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = r.nextDouble(); // Taking radius as input from user
        double area = Math.PI * radius * radius; // Calculating area using the formula πr²
        double circumference = Math.PI * 2 * radius; // Calculating area using the formula πr²
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

    }
}

