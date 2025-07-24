# Loops in Java
Loops tell the computer that a given set of instructions need to be executed repeatedly.

### Types of Loop
Primarily there are three types of loops in java.
- 1. while loop
- 2. do-while loop
- 3. for loop


### 1. while loop
**Syntax:**

```java
while (boolean condition) {
    // the statement here keeps executing as long as condition is true 
}
```

**Example:**

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

If condition never becomes false, the while loop keeps getting executed. Such a loop is known as infinte loop.

### 1. do-while loop

**Syntax:**

```java
do {
    // code to execute
} while (condition);
```

**Example:**

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

while -> checks the condition & executes the code
do-while -> checks the code & then checks the condition

### 3. for loop

**Syntax:**

```java
for (initialization; condition; update) {
    // code to execute
}
```

**Example:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
A for loop is usually used to execute a piece of code for specific number of times.

#### Decrementing for loop
```java
for (int i = 7; i != 0; i--) {
    System.out.println(i);
}
```
This for loop keeps running until i becomes 0


### break statement
- The break statement is used to exit the loop irrespective of whether the condition is true or false. 
- Whenever a "break" is encountered inside the loop, the control is sent outside the loop.
- Basically, break statement completely exits the loop.

* Exits the loop immediately.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

### continue statement 
- The continue statement is used to immediately move to the next iteration of the loop. 
- The control is taken to the next iteration thus skipping everything below "continue" inside the loop for the iteration.
- Basically, continue statement skips the particular iteration of the loop

* Skips current iteration and proceeds to the next.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```
