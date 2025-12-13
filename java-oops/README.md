## OOPS (Object Oriented Programming System)
Java is an OOP language, OOP is a programming paradigm that uses objects and classes to design and implements software solutions.

### Key Concepts
1. Class
2. Object
3. Encapsulation
4. Inheritance
5. Polymorphism
6. Abstraction

---

## Class
A class is a blueprint for creating objects. It defines the structure (fields) and behaviour (methods) of objects.

```java
class Car{
    // Instant variables (fields)
    String color;
    int speed;
    // Method drive() (methods)
    void drive(){
        System.out.println("Car is driving");
    }
}
```

## Object
An object is an instance of a class. It represents a real world entityu and has attributes and behaviors.

```java
Car myCar = new Car();
myCar.color = "Red";
myCar.drive();
```

## Encapsulation
Encapsulation is the practice of bundling data (fields) and methods (functions) that operate on the data into a single unit (class). It also involves restricting direct access to some components using access modifiers (eg. private, protected)
