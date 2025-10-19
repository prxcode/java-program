# Inheritance
Inheritance is used to borrow properties & methods from an existing class.

### Declaring Inheritance in Java 
Inheritance in Java is declared using extends keyword.
1. Superclass
2. Subclass

When a class inherits from a superclass, it inherits parts of superclass method and fields. Java doesn't support multiple inheritance ie two classes cannot be super classes for a sub class.

```java
// Inheritance in Java is declared using extends keyword

public class Dog extends Animal{ // Inheriting Dog from Animal class
  // code
}

```

### Constructors in Inheritance
- When a derived class is extended from the base class, the constructor of the base class is executed first followed by the constructor of the derived class.
- The constructors are executed in order 1 -> 2 -> 3
  1. C1 parent
  2. C2 child
  3. C3 grandchild

  
### Constructors during Constructor Overloading
When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
- If we want to call the constructor with parameters from the parent class, we can use Super keyword.
- Super(a,b); -> Calls the constructor from the parent class which takes 2 Variables

### this keyword
this is a way for us to reference an object of the class which is being created/referenced.
- this.area = 2 -> this is a reference to current object


### Super Keyword
A reference variable used to refer immediate parent class object.
- Can be used to refer immediate parent class instance variable
- Can be used to invoke parent class methods
- Can be used to invoke parent class constructors


### Method Overriding
If the child class implements the same method present in the parent class again, it is known as method overriding.
> Redefining method of superclass! (in subclass)

When an object of subclass is created and the overridden method is called, the method which has been implemented in the subclass is called and its code is executed.


### Dynamic method dispatch
Consider the following inheritance hierarchy:

- Super -> meth1,meth2
- Sub -> meth2(overridden),meth3

1. Scenario 1
```java
Super obj=new Sub() // Allowed
obj.meth2() // 2 is called (method of object)
obj.meth3() // Not Allowed 
```
2. Scenario 2 
```java
Sub obj=new Super() // Not Allowed
```
This is known as Dynamic method dispatch and is used to achieve run time polymorphism in Java.
