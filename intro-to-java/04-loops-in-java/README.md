# What Are Loops?

Loops are used in programming to **repeat a block of code** multiple times. Java provides several types of loops, each suited to different use cases.

---

## Loop Examples Included

### 1. **For Loop**
**File:** `ForLoopExample.java`

#### 🔹 Syntax:
```java
for (initialization; condition; update) {
    // Code to execute
}
````

#### 🔹 Description:

* Used when you know how many times you want to iterate.
* Initialization happens once, then condition is checked before each iteration.

#### 🔹 Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

---

### 2. **While Loop**

**File:** `WhileLoopExample.java`

#### 🔹 Syntax:

```java
while (condition) {
    // Code to execute
}
```

#### 🔹 Description:

* Checks the condition **before** each iteration.
* May execute 0 or more times depending on the condition.

#### 🔹 Example:

```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

---

### 3. **Do-While Loop**

**File:** `DoWhileLoopExample.java`

#### 🔹 Syntax:

```java
do {
    // Code to execute
} while (condition);
```

#### 🔹 Description:

* Executes the code **at least once**, then checks the condition.
* Useful when you want the loop to run regardless of the condition initially.

#### 🔹 Example:

```java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

---

### 4. **Enhanced For Loop (For-Each)**

**File:** `EnhancedForLoopExample.java`

#### 🔹 Syntax:

```java
for (type variable : array) {
    // Code to execute
}
```

#### 🔹 Description:

* Used to iterate over arrays or collections.
* Simplifies code by removing index-based access.

#### 🔹 Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

---

### 5. **Nested Loops**

**File:** `NestedLoopExample.java`

#### 🔹 Description:

* A loop inside another loop.
* Commonly used for grid-like operations (e.g., printing a multiplication table).

#### 🔹 Example:

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
    }
}
```

---

### 6. **Infinite Loop (with Break)**

**File:** `InfiniteLoopExample.java`

#### 🔹 Description:

* A loop that runs indefinitely unless stopped with a `break` statement.
* Useful for real-time programs, event handling, or games.

#### 🔹 Example:

```java
int counter = 0;
while (true) {
    if (counter == 5) break;
    System.out.println("Looping... " + counter);
    counter++;
}
```

---
