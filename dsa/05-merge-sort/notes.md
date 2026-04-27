# Sorting Algorithms: Merge Sort

## 1. Introduction & Paradigm
* **Concept:** Merge sort is a highly efficient, general-purpose, comparison-based sorting algorithm.
* **Paradigm:** It strictly follows the **Divide and Conquer** algorithmic strategy, which consists of three phases:
  1. **Divide:** Divide the unsorted array into two smaller sub-arrays of approximately equal size.
  2. **Conquer:** Recursively sort each of the sub-arrays.
  3. **Combine:** Merge the two sorted sub-arrays back into a single, fully sorted array.

## 2. The Algorithm

### Merge Sort Procedure `MergeSort(A, low, high)`
* **Base Case:** If `low >= high`, the sub-array contains one or zero elements and is inherently sorted.
* **Recursive Steps:**
  1. Find the midpoint: `mid = floor((low + high) / 2)`
  2. Recursively sort the left half: `MergeSort(A, low, mid)`
  3. Recursively sort the right half: `MergeSort(A, mid + 1, high)`
  4. Combine the halves: `Merge(A, low, mid, high)`

### The Merge Step `Merge(A, low, mid, high)`
The merging process is the engine of the algorithm. It takes two adjacent sorted sub-arrays and combines them into one.
* **Temporary Storage:** Requires an auxiliary array to temporarily store the merged results.
* **Two-Pointer Approach:** * Initialize two pointers (`i` starting at `low`, `j` starting at `mid + 1`).
  * Compare `A[i]` and `A[j]`. Copy the smaller element into the temporary array and advance the corresponding pointer.
* **Exhaustion:** Once one of the pointers reaches the end of its sub-array, copy all remaining elements from the other sub-array into the temporary array.
* **Copy Back:** Transfer the sorted elements from the temporary array back into the original array `A`.

## 3. Complexity Analysis

### Time Complexity
* **Recurrence Relation:** The time taken can be expressed as:
  $$T(n) = 2T(n/2) + O(n)$$
  * $2T(n/2)$ represents the time to recursively sort the two halves.
  * $O(n)$ represents the linear time required to merge the elements.
* **Best Case:** $O(n \log n)$
* **Average Case:** $O(n \log n)$
* **Worst Case:** $O(n \log n)$
* Merge sort performance is highly consistent. It always divides the array into halves and takes linear time to merge, regardless of the initial arrangement of the data.

### Space Complexity
* **Worst Case:** $O(n)$
* Merge sort is **not an in-place** sorting algorithm. It requires extra memory proportional to the size of the input array to hold the temporary merged data.

## 4. Key Properties
* **Stability:** **Yes**. Merge sort is a stable algorithm. It preserves the relative order of elements with equal values, which is crucial for multi-key sorting.
* **Linked Lists:** While the $O(n)$ space requirement is a drawback for arrays, Merge Sort is considered the algorithm of choice for sorting **Linked Lists**. Merging two linked lists can be done by simply updating pointers, reducing the auxiliary space complexity to $O(1)$.
