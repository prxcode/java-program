public class VariableDataTypeEx {
    // stating point of class
    public static void printMessage(String message){ // method
        System.out.println(message);
    }

    public static void main(String args[]){ //main method
        String name = "Priyanshu";
        System.out.println(name);
        printMessage("Can you see me?");

        // Data types and variables 
        int age = 20;
        System.out.println("Your age is: " + age);
        double marks = 95.99;
        System.out.println("Your marks are: " + marks);
    }
}
