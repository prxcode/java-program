# Variables & Data Types in Java
Just like we have some rules that we follow to speak english(grammar), we have some rules to follow while writing a Java Program. The set of these rules is called **Syntax**.

### Variables
A Variable is a container that stores a value. This value can be changed during the execution of the program.
Ex: `int number = 8`
> here `int` = data type, `number` = variable, `8` = value it stores.

### Rules for declaring a variable name
We can choose a name while declaring variable if the following rules are followed.
- **Must NOT begin with a digit** [int 1prxcode; is invalid]
- **Name is case sensitive** [prx and Prx are different]
- **Should not be a keyword** [like void]
- **White Space not allowed** [int prx code; is invalid]
- **Can contain alphabets, $character, _character and digits if the other conditions are met** [int p1rx_code]
---

### Data Types
There are 2 main types of Data Types:
* **Primitive Data Types** – to store simple values
* **Non-Primitive Data Types** – to store complex values

---

### Primitive Data Types
These are variables which must be declared before use.

| Data Type | Meaning                | Size (Bytes) | Range                                                   |
| --------- | ---------------------- | ------------ | ------------------------------------------------------- |
| `byte`    | 2’s complement integer | 1            | -128 to 127                                             |
| `short`   | 2’s complement integer | 2            | -32K to 32K                                             |
| `int`     | Integer numbers        | 4            | -2B to 2B                                               |
| `long`    | Larger integer values  | 8            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | Floating-point         | 4            | Up to 7 decimal digits                                  |
| `double`  | Double precision float | 8            | Up to 16 decimal digits                                 |
| `char`    | Character              | 2            | `a, b, c, A, B, C, @, #, $` etc.                        |
| `boolean` | Boolean                | 1            | `true`, `false`                                         |


To choose data type for our multiple variables in our program. In order to choose the data type we first need to find the type of data we want to store. After that we need to analyze the min and max value we might use

### Literals
A constant value which can be assigned to the variable is called as a literal.

- 101 = Integer Literal
- 10.1f = Float Literal
- 10.1 = Double Literal
- 'A' = Character Literal
- true = Boolean Literal
- "prxcode" = String Literal

### Keywords 
Words which are reserved and used by the Java compiler. They cannot be used as an identifier.


### Reading data from the keyboard
In order to read data from the keyboard, Java has a scanner class. Scanner class has a lot of methods to read the data from the keyboard

Read from the keyboard ->
`Scanner S = new Scanner(System.in);`

Method to read from the keyboard ->
`int a = S.nextInt();`

---

### Non-Primitive Data Types

These are of **variable size** and are usually declared using the `new` keyword.

Examples:

```java
String name = new String("Aman");

int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;
```

---
