//Only one public class is allowed per file in Java


// Basically here we are already predefining a class called Employee and all variable 
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My ID is " + id);
        System.out.println("and my name is " + name);

    }
}

public class customclass {
    public static void main(String[] args) {
        System.out.println("This is a custom class in Java.");

        // Instatiating a new Employee object
        Employee prx = new Employee(); 
        Employee john = new Employee();

        // Setting values for the Employee object (setting attributes)
        prx.id = 404;
        prx.name = "Priyanshu";

        john.id = 1911;
        john.name = "John Marston";

        prx.printDetails();
        john.printDetails();
        // Printing the attributes
        // System.out.println(prx.id);
        // System.out.println(prx.name);

        
    }
}