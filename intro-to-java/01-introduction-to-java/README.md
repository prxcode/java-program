# Java
Java is an object oriented programming language developed by Sun microsystems of USA in 1991. It was originally called **Oak** by James Goslin.

Java = Purely Object Oriented 

### How Java Works?
- Java is compiled into bytecode and then it is interpreted to machine code.
- Basically, The source code we write in .java is compiled inside JDK and we get Byte Code .class. Byte Code that is in .class is interpreted to native code through JVM

### JDK 
- Java Development Kit is a collection of tools used for devloping and running java programs. 
- Inside JDK we have --> JRE (Java Runtime Environment) + Development Tools

### JRE (Java Runtime Environment)
- Java Runtime Environment helps in executing programs developed in Java.
- Inside JRE we have --> JVM (Java Virtual Machine) + Libraries

### Basic Structure of Java Program
```java
package com.company

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

```

### Function 
void main (){
    .....
}

### Class
class Main{
    void main (){
    .....
}
}

>File Name Must Match Class Name

### Naming Convention
- **For class** we use PascalConvention, First and subsequent character from a word are capital letters(uppercase).
Ex: Main, MyScanner, MyNameIsPriyanshu
- **For function and variable** we use camelCaseConvention, here first character is lowercase and the subsequent characters are uppercase.
Ex: main, myScanner, myNameIsPriyanshu  


---
### Hello World program in Java, C, Python

#### Java
```java
// In JAVA
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
````

#### C Programming

```c
// In C
#include <stdio.h>

int main() {
    printf("Hello World!");
    return 0;
}
```

#### Python

```python
# In Python
print("Hello World!")
```


