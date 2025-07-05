# Conditions in Java (if-else statements)
**Conditions** in Java are used to make decisions in a program. They allow the program to **execute certain blocks of code based on whether a condition is true or false**.

---

## Common Conditional Statements in Java:

### 1. **`if` Statement**

Executes a block of code if a condition is true.

```java
if (condition) {
    // code to execute if condition is true
}
```

### 2. **`if-else` Statement**

Executes one block of code if the condition is true, otherwise another block.

```java
if (condition) {
    // true block
} else {
    // false block
}
```

### 3. **`if-else if-else` Ladder**

Checks multiple conditions in sequence.

```java
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if none of the conditions are true
}
```

### 4. **Nested `if` Statements**

`if` statements inside another `if` or `else` block.

```java
if (condition1) {
    if (condition2) {
        // code if both conditions are true
    }
}
```

---

## Comparison Operators Used in Conditions

| Operator | Meaning               | Example  |
| -------- | --------------------- | -------- |
| `==`     | Equal to              | `a == b` |
| `!=`     | Not equal to          | `a != b` |
| `>`      | Greater than          | `a > b`  |
| `<`      | Less than             | `a < b`  |
| `>=`     | Greater than or equal | `a >= b` |
| `<=`     | Less than or equal    | `a <= b` |

---

## Example

```java
int age = 20;

if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not an adult");
}
```

**Output:**

```
Adult
```

