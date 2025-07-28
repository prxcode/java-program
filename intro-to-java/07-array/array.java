public class array {
    public static void main(String[] args) {
        /*Classroom of 500 students - You have to store marks of these 500 students
         * You have 2 options:
         * 1. Create 500 variables: student1, student2, ..., student500
         * 2. Use an array (recommended)
         */

         // There are 3 main ways to create arryas in Java

        // 1. Declare an array and then memory allocation 
        // int[] marks = new int[5]; // Declare an array of integers
        
        // 2. Declare and then memory allocation
        // int [] marks;
        // marks = new int[5]; // Declare an array of integers with a size of 500 
        // Intialization of array elements
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;
        // marks[4] = 96;
        // marks[7] = 96;        
        // System.out.println(marks[3]); // Accessing the first element of the array
        // System.out.println(marks[4]); // overwrite value
        // System.out.println(marks[4]); //throws an ERROR
        
        // 3. Declare and initialize 
        int [] marks = {51,66,45,36,22};
        System.out.println(marks[3]); 
    
    }

}