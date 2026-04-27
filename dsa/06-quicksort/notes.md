# Sorting Algorithms: Quick Sort

## 1. Introduction & Paradigm
* **Concept:** Quick Sort is a highly efficient, randomized sorting algorithm.
* **Paradigm:** It relies on the **Divide and Conquer** paradigm to sort an array in-place.
* **Characteristics:** It is often the fastest sorting algorithm in practice for large datasets, despite having a poor worst-case time complexity, because its expected (average) running time is very fast and it requires very little additional memory.

## 2. The Algorithm
Quick Sort operates through three main steps:

1.  **Divide (Partitioning):** * Pick an element $x$ from the sequence $S$ to act as a **pivot**. (This can be the last element, the first element, or a random element).
    * Rearrange the elements in the array so that:
        * All elements less than or equal to $x$ are placed in the left subarray ($L$).
        * The pivot $x$ is placed in its final sorted position (the middle, $E$).
        * All elements greater than $x$ are placed in the right subarray ($G$).
2.  **Conquer (Recur):** Recursively apply the Quick Sort algorithm to the left subarray ($L$) and the right subarray ($G$).
3.  **Combine:** Since the subproblems are sorted in-place, no additional work is needed to combine them. The array is automatically sorted.

## 3. Core Procedures

### The Partition Routine `Partition(A, p, r)`
This is the engine of Quick Sort. It partitions the subarray $A[p..r]$ in place using the last element $A[r]$ as the pivot.

```text
Algorithm Partition(A, p, r)
    x = A[r]             // Choose the last element as the pivot
    i = p - 1            // Index of the smaller element
    
    for j = p to r - 1
        if A[j] <= x
            i = i + 1
            Exchange A[i] with A[j]
            
    Exchange A[i + 1] with A[r]  // Place the pivot in its correct position
    return i + 1                 // Return the partition index
```

### The Quick Sort Routine `Quicksort(A, p, r)`
```text
Algorithm Quicksort(A, p, r)
    if p < r
        q = Partition(A, p, r)    // Partition the array
        Quicksort(A, p, q - 1)    // Recursively sort the left side
        Quicksort(A, q + 1, r)    // Recursively sort the right side
```

## 4. The Quick-Sort Tree
The execution of Quick Sort can be visualized as a binary tree:
* **Nodes** represent the recursive calls on specific subarrays.
* **Leaves** represent base cases (subarrays of size 0 or 1, which are already sorted).
* The overall work done at any depth $i$ of the tree is $O(n)$.

## 5. Complexity Analysis

### Worst-Case Running Time
* **Condition:** The worst-case occurs when the chosen pivot is consistently the unique minimum or maximum element in the array. 
* **Effect:** This causes highly unbalanced partitions where one subarray has size $n-1$ and the other has size 0. 
* **Time Complexity:** The running time becomes proportional to the sum $n + (n-1) + ... + 2 + 1$, resulting in **$O(n^2)$**.

### Expected (Average) Running Time
* **Condition:** A "good" recursive call happens when the pivot divides the array relatively evenly (e.g., both $L$ and $G$ have sizes less than $3s/4$). 
* **Effect:** Probabilistic analysis shows that half of the possible pivots yield "good" calls. The expected height of the Quick-Sort tree is constrained to $O(\log n)$.
* **Time Complexity:** Since $O(n)$ work is done at each level of the tree, the expected overall running time is **$O(n \log n)$**.

## 6. Summary Comparison
| Algorithm | Time Complexity | Notes |
| :--- | :--- | :--- |
| **Insertion Sort** | $O(n^2)$ | In-place. Slow for large inputs, but excellent for small or nearly-sorted datasets. |
| **Merge Sort** | $O(n \log n)$ | Fast and stable. Good for sequential access, but **not** in-place (requires $O(n)$ extra memory). |
| **Quick Sort** | Expected $O(n \log n)$, Worst $O(n^2)$ | Fastest in practice. Randomized algorithm. Sorts **in-place** (requires minimal extra memory). |
