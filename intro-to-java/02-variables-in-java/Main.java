
// -> Three ways to print in Java

// here class name is Main
// and function is void main 


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //println adds a new line after printing
        System.out.print("yo! prxcode\n"); // print statement with a new line character "\n"
        System.out.print("How are you?"); // normal print statement does not add a new line

        //now what will happen if we print like this?
        System.out.print("Yes, I am prxcode, \nI like to code and \n learn new languages such as Java."); // first one is perfect but in 2nd "\n" you can see gap before line
    }
}
