# Stacks

## 1. Introduction to Data Structures
* **Linear Data Structures:** Data is organized in a sequential, linear fashion (e.g., Stacks, Queues, Linked Lists).
* **Non-linear Data Structures:** Data is organized hierarchically or interconnectedly (e.g., Trees, Graphs).
* **Standard Operations:** Insert (add), Delete (remove), Search, Traverse.

## 2. Abstract Data Type (ADT)
* **Definition:** A conceptual model that defines a data type by its set of values and the operations that can be performed on those values.
* **Encapsulation:** An ADT focuses on *what* operations do, hiding the internal implementation details (*how* they do it) from the user. 
* **Architecture:** Application programs interact with the ADT strictly through a public interface (public functions), completely shielded from the underlying memory or data structure (like Arrays or Linked Lists).

## 3. The Stack ADT
* **Concept:** A dynamic, linear collection of items with a restricted access policy.
* **LIFO Principle:** Last-In, First-Out. Items can only be added or removed from one end, called the **Top of Stack (TOS)**.
* **Real-world Examples:** A pile of plates or a stack of books.
* **Standard Operations:**
  * `push(o)`: Insert an element at the top.
  * `pop()`: Remove and return the top element.
  * `top()` / `peek()`: Return the top element without removing it.
  * `size()`: Return the number of elements.
  * `isEmpty()`: Return true if the stack has no elements.
  * `isFull()`: Return true if the stack has reached its maximum capacity.

## 4. Array Implementation of Stacks
* **Setup:** Uses an array `S` of maximum size `N`. An integer variable `t` denotes the Top of Stack (TOS), initialized to `-1`.
* **Exceptions:**
  * **Underflow Error:** Occurs when attempting to `pop()` or `top()` an empty stack.
  * **Overflow Error:** Occurs when attempting to `push()` onto a full stack.
* **Time Complexity:** All stack operations (`push`, `pop`, `top`, `size`, `isEmpty`) run in **O(1)** time.

### Pseudocode
```text
Algorithm size()
    return t + 1

Algorithm isEmpty()
    if t == -1 return true
    else return false

Algorithm top()
    if isEmpty() return Error
    return S[t]

Algorithm push(o)
    if size() == N return Error (Overflow)
    t <- t + 1
    S[t] <- o

Algorithm pop()
    if isEmpty() return Error (Underflow)
    e <- S[t]
    S[t] <- null
    t <- t - 1
    return e
```

## 5. Applications of Stacks

### A. Everyday Software Features
* **Web Browsers:** The "Back" button functionality.
* **Text Editors:** The "Undo" operation.

### B. Polish Notations (Expression Evaluation & Conversion)
Arithmetic expressions can be formatted as Infix (e.g., `X + Y`), Prefix (`+ X Y`), or Postfix (`X Y +`). Computers use Stacks to convert and evaluate these easily.

**1. Evaluating Postfix Expressions**
* Start with an empty stack. Scan expression left to right.
* If an **operand** is found: Push it onto the stack.
* If an **operator** is found: 
  1. Pop the top value (call it B).
  2. Pop the next value (call it A).
  3. Evaluate `A operator B`.
  4. Push the result back onto the stack.
* At the end, pop the final value from the stack (the answer).

**2. Converting Infix to Postfix**
* Print operands directly to the output.
* If `(`, push onto stack.
* If `)`, pop and print operators from the stack until `(` is encountered. Discard the parentheses.
* If an operator is encountered:
  * Push it if the stack is empty, has a `(`, or if the incoming operator has *higher* precedence than the TOS.
  * If it has *lower* precedence, pop and print the TOS, then re-test.
  * If it has *equal* precedence, use associativity rules (Left-to-Right = pop and print TOS, then push incoming; Right-to-Left = push incoming).
* At the end, pop and print all remaining operators.

### C. Balancing Symbols
* Used by compilers to check for matching parentheses/brackets (`()`, `{}`, `[]`).
* **Algorithm:**
  * Scan expression left to right.
  * If an opening symbol is read, push it.
  * If a closing symbol is read:
    * If the stack is empty, report an error.
    * Pop the stack. If the popped symbol is not the corresponding opening symbol, report an error.
  * After reading all characters, if the stack is not empty, report an error.

### D. Function/Method Calls and Recursion
* **Method Stack:** The runtime environment maintains a stack to track active method calls.
* **Frames:** Elements of this stack are called "frames." Each frame holds local variables, register values, function parameters, and the return address (Program Counter).
* **Recursion:** A function calling itself creates a new frame on the stack for every call. When a call returns, its frame is popped.
* **Stack Overflow (Recursion):** If a recursive function lacks a proper base case and calls itself infinitely, the method stack fills up, causing a "Stack Overflow" crash.
```
