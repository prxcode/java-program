# Introduction to Object Oriented Programming (OOP)
- Object Oriented Programming tries to map code instructions with real world making the code short and easier to understand.
- Solving a problem by creating object is one of the most popular approaches in programming. This is called Object Oriented Programming (OOPs).

### What is DRY?
DRY stands for: Do not repeat yourself (focuses on reusablity)

### Class
A class is a blueprint for creating objects.

### Object
An object is an instantiation of a class. When a class is defined, a template is defined. Memory is allocated only after object instantiation.

### How to model a problem in OOPs
We identify the following;
- Noun -> Class -> Employee
- Adjective -> Attributes -> name, age, salary
- Verb -> Methods -> getSalary(), increment()

### OOPs Terminology
1. Abstraction: Hiding internal details (show only essential info), ex. using phone without bothering about how it was made.
2. Encapsulation: The act of putting various components together(in a capsule). ex. laptop is single entity with camera + speaker + storage in a single box.
> In Java, encapsulation simply means that the sensitive data can be hidden from the users.
3. Inheritance: The act of driving new things from exisiting things. ex. Phone -> Smart Phone
4. Polymosphism: One entity many forms. ex. smartphone -> phone call, also smartphone -> calculator

### Writing a custom class
We can write a custom class as follows:
```java
public class Employee{
  int id; // Attribute 1
  String name; // Attribute 2
```
> Any real world objects = Properties + Behaviour
> Object in OOPs = Attributes + Methods

### A class with methods
We can add methods to our class Employee as follows:
```java
public class Employee{
  public int id;
  public String name;

  public int getSalary(){
  //code
  }
  public void getDetails(){
  //code
  }
};
```
