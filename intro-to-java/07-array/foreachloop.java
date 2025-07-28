public class foreachloop {
    public static void main(String[] args) {
        // float [] marks = {51.2f, 66.4f, 45.7f, 36.3f, 22.1f}; //need to write f for float
        // String [] students = {"John", "Jane", "Doe", "Alice", "Bob"}; // not its "String" not "string"
        // System.out.println(students[3]); // Accessing the fourth element of the array
        // System.out.println(marks.length); // length of array is 5
        
        int [] marks = {51, 66, 45, 36, 22}; // Array of integers
        // System.out.println(marks.length); // length of array is 5

        // Displaying Array Elements WITHOUT for loop
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // Displaying Array Elements WITH for loop
        // System.out.println("Printing using for loop");
        // for (int i=0; i<marks.length; i++) {
        //     System.out.println(marks[i]);


        // Displaying Array in reverse order
        // System.out.println("Printing using for loop in reverse order");
        // for (int i=marks.length-1; i>=0; i--) {
        //     System.out.println(marks[i]);
            
        // }




        // Displaying the Array (for each loop)
        System.out.println("Printing using for each loop");
        for (int element : marks) {
            System.out.println(element); // Using enhanced for loop to print each element
        }
    }
}
