# Methods in Array
Sometime our program grows in size and we want to seprate the logic of main method to other methods. For instance - If we are calculating average of a number pair 5 times, we can use methods to avoid repeating the logic. 

### Syntax of a method
A method is a function written inside a class, Since java is an object oriented language, we need to write the method inside some class

```java
dataType methodName(parameters) {
    // code
    return value;
}
```

Following method returns sum of two numbers:
```java
int mySum(int a, int b) {
    int c = a + b;
    return c;
}
```

### Calling a Method 
A method can be called by creating an object of the class in which the method exists followed by the method call:
```java
Calc obj = new Calc();      // Create an object of class Calc
int result = obj.mySum(2, 3); // Call the method with values
```

The values from the method call (a and b) are copied to the a and b of the function mySum. Thus even if we modify the values a and b inside the method, the values in the main method will not change


### Void return type
When we dont want our method to return anything, we use void as the return type
```java
void sayHello() {
    System.out.println("Hello!");
}
```

### Static keyword
Static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is shared by all the objects
```java
public static int add(int a, int b) {
    return a + b;
}
```
- Normally, you need to create an object to use a method.
- But if a method is marked static, you can call it without creating an object.

```java
int result = MyClass.add(2, 3);

```

### Process of method invocation in java
Consider the method sum:
```java
int sum(int a, int b)
  {
  return a+b;
}
```

The method is called like this:
```java
Calc obj = new calc();
c = obj.sum(2,3)
```
The values 2 and 3 are copied to a and b and then a+b=2+3=5 is returned in c which is an integer

> In case of Arrays, the reference is passed. Same is the case for object passing to methods.


### Method Overloading 
Two or more methods can have same name but different parameters such methods are called overloaded methods.

```java
void print() {}
void print(int a) {}
void print(int a, int b) {}
```
Method overlaoding cannot be performed by changing the return type of methods.

### Variable Arguments (varargs) 
A function with vararg can be created in java using the following syntax:
```java
public static void foo(int... arr) {
    // arr is an int[] array now
    for (int a : arr) {
        System.out.println(a);
    }
}
```

> foo can be called with zero or more arguments like this:
- foo(7) foo(7,8,9) foo(1,2,7,8,9)

We can also create a function bar like this
```java
public static void bar(int a, int b)
  {
  // code
  }
```
> bar can be called as bar(1), bar(1,2), bar(1,7,9,11) etc.


### Recursion
A function in java can call itself such calling a function by itself is called recursion.
- Example: Factorial of a number
```java
int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```



