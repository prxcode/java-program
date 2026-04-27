## Introduction to Data Structures and Algorithms 

* **Data Structures:** A systematic way to organize and access data. 
* **Types of Data Structures:** They can be categorized as primitive or non-primitive, and linear or non-linear.
* **Algorithm:** A step-by-step procedure designed to solve a specific problem within a finite amount of time. 
* **Relationship:** Data structures and algorithms are closely associated and cater to each other to solve problems efficiently.

---

## Algorithm Analysis & "Goodness"

The "goodness" of an algorithm is generally measured by two primary metrics:
* **Space Complexity:** The memory size (in bytes or bits) required by the algorithm.
* **Time Complexity:** The running time required for the algorithm to execute.

### Ways to Analyze Performance

**1. Experimental Studies**
* Involves writing a program to implement the algorithm and running it with varying input sizes.
* Uses methods like `System.currentTimeMillis()` to get accurate actual running times and plot the results.
* **Limitations:** Requires full implementation, results depend heavily on the hardware/software environment, and the tested inputs may not be indicative of all scenarios.

**2. Theoretical Analysis**
* Uses a high-level pseudocode description instead of a full implementation.
* Evaluates speed independently of the hardware/software environment by representing running time as a function of the input size, $n$.
* Takes all possible input sizes into account.

---

## Running Time & Primitive Operations

* **Primitive Operations:** Basic computations identifiable in pseudocode, such as evaluating an expression, assigning a value, indexing into an array, or calling/returning from a method.
* **Worst-Case Focus:** Analysis primarily focuses on the worst-case running time because it is easier to calculate and crucial for real-time applications like games, finance, and robotics.
* **Intrinsic Growth:** Hardware and software changes only affect the running time by a constant factor; they do not alter the intrinsic growth rate of the algorithm.

---

## Growth Rates & Asymptotic Notation

Asymptotic analysis describes how the running time of a function $f(n)$ grows as the input $n$ gets very large. Constant factors and lower-order terms are disregarded.

### Common Growth Rates (Fastest to Slowest)
The relative growth rates of functions are ordered as follows:
$1 < \log n < n < n \log n < n^2 < n^3 < 2^n < n!$

### Asymptotic Notations

* **Big-Oh ($O$) - Upper Bound:** * $f(n)$ is $O(g(n))$ if $f(n)$ is asymptotically less than or equal to $g(n)$.
    * Mathematically: $f(n) \le c \cdot g(n)$ for $n \ge n_0$ (where $c > 0$ and $n_0 \ge 1$).
* **Big-Omega ($\Omega$) - Lower Bound:** * $f(n)$ is $\Omega(g(n))$ if $f(n)$ is asymptotically greater than or equal to $g(n)$.
    * Mathematically: $f(n) \ge c \cdot g(n)$ for $n \ge n_0$.
* **Big-Theta ($\Theta$) - Tight Bound:** * $f(n)$ is $\Theta(g(n))$ if $f(n)$ is asymptotically equal to $g(n)$.
    * Mathematically: $c_1 \cdot g(n) \le f(n) \le c_2 \cdot g(n)$ for $n \ge n_0$.
* **little-oh ($o$) - Strict Upper Bound:** * $f(n)$ is $o(g(n))$ if $f(n)$ is asymptotically *strictly* less than $g(n)$.
    * Mathematically: $f(n) < c \cdot g(n)$ for *every* constant $c > 0$ and $n \ge n_0$.
* **little-omega ($\omega$) - Strict Lower Bound:** * $f(n)$ is $\omega(g(n))$ if $f(n)$ is asymptotically *strictly* greater than $g(n)$.
    * Mathematically: $f(n) > c \cdot g(n)$ for *every* constant $c > 0$ and $n \ge n_0$.
