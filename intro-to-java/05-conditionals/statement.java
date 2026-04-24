public class statement {
    public static void main(String[] args) {
       int age  = 2;
       if(age>18){
        System.out.println("You are an adult.");
       }
       else if (age == 18) {
        System.out.println("You are exact 18 so adult.");
       }
       else {
        System.out.println("You are not an adult.");
       }
    }
}

// or you can also write like this 

import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Hello long time no see?");
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age>0 && age<18){
            System.out.println("you are kid!");
        }
        else if(age <200 && age >= 18){
            System.out.println("your are older!");
        }
        else {
            System.out.println("Enter valid age!!");
        }
        
        
    }
}
