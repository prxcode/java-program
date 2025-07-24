# **Loops**

### **1. for Loop**

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

---

### **2. while Loop**

**Syntax:**

```java
while (condition) {
    // code to execute
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

---

### **3. do-while Loop**

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

---

### **4. Enhanced for Loop (for-each)**

**Syntax:**

```java
for (type var : array) {
    // use var
}
```

**Example:**

```java
int[] nums = {1, 2, 3};
for (int n : nums) {
    System.out.println(n);
}
```

---

## **Loop Control Statements**

### **break**

* Exits the loop immediately.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

### **continue**

* Skips current iteration and proceeds to the next.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```

