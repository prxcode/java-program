# Searching Algorithms

## 1. Introduction to Searching
* **Objective:** To determine if a specific piece of data (the target) is present within a collection of data (like an array).
* **Outcomes:** If the element is found, the search is *successful* (typically returning its position). If not, it is *unsuccessful* (typically returning -1).
* **Primary Approaches:**
  1. **Linear Search (Sequential Search):** Used when array elements are in a random or unsorted order.
  2. **Binary Search:** A more efficient method used strictly when array elements are in a sorted order.

---

## 2. Linear Search
Linear search checks each element of the array sequentially until the target element is found or the end of the array is reached.

* **Algorithm Steps:**
  1. Initialize `Pos = -1`.
  2. Loop from index `i = 0` to `n - 1` (where `n` is the number of elements).
  3. If the element at index `i` (`a[i]`) equals the target `k`, set `Pos = i` and break.
  4. If `Pos < 0`, the element is not found. Otherwise, print `Pos`.
* **Time Complexity Analysis:** * In the worst-case scenario (element is at the end or not present), the loop runs `n` times.
  * **Time Complexity:** **O(n)**

---

## 3. Binary Search
Binary search is a highly efficient searching algorithm, but it has a strict constraint: **the given array must be sorted**. (If it is not sorted, the sorting time must be added to the overall operation time).

### A. Iterative Binary Search
* **Algorithm Steps:**
  1. Initialize `low = 0` and `high = n - 1`.
  2. Loop while `low <= high`.
  3. Calculate the middle index: `mid = floor((low + high) / 2)`.
  4. If `a[mid] == Item`: Set `Pos = mid`, break the loop, and return the position.
  5. If `Item < a[mid]`: The item must be in the left half. Update `high = mid - 1`.
  6. If `Item > a[mid]`: The item must be in the right half. Update `low = mid + 1`.
  7. If the loop ends and `Pos` is still negative, the element is not found.
* **Time Complexity Analysis:**
  * In the worst case, the search space is halved in each step.
  * Number of comparisons required is at most $\log_2 n$.
  * **Time Complexity:** **O(log n)**

### B. Recursive Binary Search
Binary search can also be implemented using recursion by passing the updated `low` and `high` bounds into the function itself.

* **Algorithm (`Bin_Search(a, Item, low, high)`):**
  1. Base Condition: If `low <= high`.
  2. Calculate `mid = floor((low + high) / 2)`.
  3. If `a[mid] == Item`: Return `mid`.
  4. If `Item < a[mid]`: Return `Bin_Search(a, Item, low, mid - 1)`.
  5. If `Item > a[mid]`: Return `Bin_Search(a, Item, mid + 1, high)`.
  6. If `low > high`, return -1 (not found).

---

## 4. Recurrence Relations
A recurrence relation is a mathematical expression that defines a sequence in terms of its previous terms. In algorithm analysis, it models the time complexity of recursive algorithms.

* **Examples of Recurrence Relations:**
  * $T(n) = T(n-1) + n$
  * $T(n) = T(n/2) + 1$
  * $T(n) = 2T(n-1) + 1$

### Solving Recurrence Relations (Substitution Method)
The substitution method involves repeatedly substituting the recurrence relation into itself to find a recognizable pattern.

**Example 1: Factorial Recursive**
* Relation: $T(n) = T(n-1) + 1$ (for $n > 1$), and $T(1) = 1$
* Substitution: 
  * $T(n) = T(n-1) + 1$
  * $T(n) = (T(n-2) + 1) + 1 = T(n-2) + 2$
  * ... continues until ...
  * $T(n) = T(1) + (n-1) = 1 + n - 1 = n$
* **Complexity:** **O(n)**

**Example 2: Recursive Binary Search**
* Relation: $T(n) = T(n/2) + 1$ (for $n > 1$), and $T(1) = 1$
* Substitution:
  * $T(n) = T(n/2) + 1$
  * $T(n) = (T(n/4) + 1) + 1 = T(n/4) + 2$
  * $T(n) = T(n/2^k) + k$
* We stop when $n/2^k = 1$, which means $n = 2^k$.
* Apply $\log_2$ to both sides: $\log_2 n = k$.
* Substitute $k$ back into the equation: $T(n) = T(1) + \log_2 n = 1 + \log_2 n$.
* **Complexity:** **O(log n)**
