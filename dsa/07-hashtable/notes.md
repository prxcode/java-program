# Data Structures: Hash Tables

## 1. Introduction to Hash Tables
* **Objective:** To achieve constant time **O(1)** complexity for search, insert, and delete operations, overcoming the limitations of Linear Search ($O(n)$) and Binary Search ($O(\log n)$).
* **Concept:** A data structure used to store key-element `(k, e)` pairs. It uses a function to compute an index into an array of buckets or slots, from which the desired value can be found.
* **Applications:** Databases (unique key retrieval), Caching, Symbol Tables (compilers), and Network Routing.

## 2. Components of a Hash Table
A hash table consists of two major components:
1.  **Bucket Array (Table):** An array of size $N$ where each cell is a "bucket" that can store an item.
2.  **Hash Function:** A function $h(k)$ that maps an arbitrary key $k$ to a valid integer index in the range $[0, N-1]$.

---

## 3. Designing a Hash Function
A good hash function should be fast to compute and minimize collisions (distribute keys evenly). It generally consists of two steps:

### Step 1: Hash Code Map (Mapping key to an integer)
Especially important for non-integer keys like strings.
* **Component Sum:** Sums the ASCII values of characters in a string. 
  * *Flaw:* Prone to collisions for anagrams (e.g., "stop", "pots", and "tops" all yield the same sum).
* **Polynomial Hash Code:** Takes position into account. Uses a constant $a$ (commonly 33, 37, 39, or 41).
  * Formula: $p(a) = x_0 + x_1a + x_2a^2 + ... + x_{n-1}a^{n-1}$ (where $x_i$ is the ASCII value of the character).

### Step 2: Compression Map (Mapping integer to array index $[0, N-1]$)
* **Division Method:** $h(k) = |k| \mod N$.
  * $N$ is usually chosen to be a prime number to help "spread out" the hashed values.
* **Multiply and Divide (MAD):** $h(k) = |ak + b| \mod N$.
  * $a$ and $b$ are non-negative integer constants.

---

## 4. Collisions
* **Definition:** A collision occurs when the hash function maps two *different* keys to the *same* bucket array index.
* **Consequence:** Since a bucket can generally store only one item directly, collisions must be resolved. High collision rates degrade performance to **O(n)** in the worst case.

---

## 5. Collision Handling Strategies

### A. Separate Chaining
* **Mechanism:** Each cell in the bucket array stores a pointer to a Linked List. Colliding items are simply appended to the list at that specific index.
* **Pros:** Simple to implement.
* **Cons:** Requires additional memory for pointers/nodes outside of the primary array.

### B. Open Addressing
Colliding items are placed in a different, unoccupied cell within the bucket array itself.

**1. Linear Probing**
* **Mechanism:** If $A[i]$ is occupied, sequentially check the next slots: $A[(i + j) \mod N]$ for $j = 1, 2, 3...$ until an empty bucket is found.
* **Drawback - Primary Clustering:** Colliding items tend to lump together in contiguous blocks, causing subsequent insertions to take longer.
* **Deletion Issue:** You cannot simply remove an item, or it will break the probe chain for searching other items.
  * *Solution:* Replace the deleted item with a special `AVAILABLE` (or `DELETED`) marker. `Search` skips over it, but `Insert` treats it as an empty slot to reuse.

**2. Quadratic Probing**
* **Mechanism:** If $A[i]$ is occupied, try cells using a quadratic function: $A[(i + j^2) \mod N]$ for $j = 1, 2, 3...$
* **Drawback - Secondary Clustering:** If two keys hash to the same initial index, they will follow the exact same probe sequence, potentially causing clustering.

**3. Double Hashing**
* **Mechanism:** Uses a secondary hash function $d(k)$ to determine the step size. Iteratively probes cells at $A[(i + j \cdot d(k)) \mod N]$ for $j = 1, 2, 3...$
* **Secondary Function Choice:** Commonly $d(k) = q - (k \mod q)$ where $q < N$ and $q$ is a prime number.
* **Advantage:** Eliminates both primary and secondary clustering issues.

---

## 6. Load Factor & Rehashing

* **Load Factor ($\lambda$):** The ratio of the number of entries ($n$) to the capacity of the array ($N$). $\lambda = n / N$.
* **Impact:** * Low load factor ($< 0.5$): Fast lookups/insertions but wastes memory.
  * High load factor: Increases collisions significantly, degrading performance.
* **Threshold:** In open addressing, the load factor must be kept $< 1$, and is typically kept below **0.75**.
* **Rehashing:** When the load factor exceeds the threshold (e.g., 0.75), the hash table must be rebuilt:
  1. Create a new bucket array approximately **double** the size (choosing the next prime number).
  2. Update the compression map (hash function) to reflect the new size $N$.
  3. Re-insert (rehash) all existing elements into the new array.

---

## 7. Complexity Summary
* **Average Case:** **O(1)** for Insert, Delete, and Search.
* **Worst Case:** **O(n)** for Insert, Delete, and Search (occurs when all keys collide into the same bucket).
