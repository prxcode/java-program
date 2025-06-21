Here’s a clean and well-formatted `.md` (Markdown) file for your notes on **Variables & Data Types in Java**. You can copy this into a file named `Variables-and-Data-Types.md` and use it in your Java course repo.

---

````markdown
# Variables & Data Types in Java

---

## 📦 Variables

A **variable** is a container (storage area) used to hold data.  
Each variable should be given a unique name (identifier).

```java
package com.apnacollege;

public class Main {

    public static void main(String[] args) {
        // Variables
        String name = "Aman";
        int age = 30;

        String neighbour = "Akku";
        String friend = neighbour;
    }
}
````

---

## 🧮 Data Types

**Data types** are declarations for variables.
This determines the type and size of data associated with variables, which is essential because different data types occupy different sizes of memory.

There are 2 main types of Data Types:

* **Primitive Data Types** – to store simple values
* **Non-Primitive Data Types** – to store complex values

---

### ✅ Primitive Data Types

These are the data types of **fixed size**.

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

---

### 📦 Non-Primitive Data Types

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

## 🔒 Constants

A **constant** is a variable in Java that has a **fixed value** – it cannot be reassigned once initialized.

```java
package com.apnacollege;

public class Main {

    public static void main(String[] args) {
        // Constants
        final float PI = 3.14F;
    }
}
```
