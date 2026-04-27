# Queues

## 1. Core Concepts
* **Definition:** A Queue is a linear data structure that stores data objects in a **First-In-First-Out (FIFO)** manner.
* **Access Points:**
  * **Insertion (Enqueue):** Happens at the **Rear** end of the queue.
  * **Deletion (Dequeue):** Happens at the **Front** end of the queue.
* **Common Error Conditions:**
  * **Underflow:** Attempting to delete an element from an empty queue.
  * **Overflow:** Attempting to insert an element into an already full queue.

## 2. Standard Operations
* `enqueue`: Inserts an element at the rear end of the queue.
* `dequeue`: Removes and returns the element at the front of the queue.
* `size`: Returns the number of elements currently in the queue.
* `isEmpty`: Indicates whether the queue is empty (returns true or false).
* `front`: Returns the element at the front without removing it.

---

## 3. Linear Queue (Normal Configuration)
Implemented using an array `Q` with a maximum size `N`. It uses two index variables to track positions:
* `f`: Index of the front element.
* `r`: Index immediately past the rear element.

**Initial State & Conditions:**
* **Initialization:** `f = r = 0`
* **Empty Condition:** `f == r`
* **Full Condition:** `r == N`

### Pseudocode for Linear Queue
**Enqueue Algorithm:**
```text
Algorithm enqueue(o)
    if r == N then
        return QFullError
    Q[r] <- o
    r <- r + 1
```

**Dequeue Algorithm:**
```text
Algorithm dequeue()
    if f == r then
        return QEmptyError
    e <- Q[f]
    Q[f] <- null
    f <- f + 1
    return e
```

### Limitation of Linear Queues
If the last position of the queue is occupied (`r == N`), the full condition is triggered. This means no more elements can be enqueued, **even if there are vacant positions** at the front of the array caused by previous `dequeue` operations. 

**Solutions to this limitation:**
1. Shift all elements left towards the beginning of the array (very time-consuming for long queues).
2. Use a **Circular Queue**.

---

## 4. Circular Queue (Wraparound Configuration)
A Circular Queue solves the linear queue limitation by treating the array as a circle. When the rear index reaches the end of the array, it wraps around to the beginning.
* **Indices sequence:** 0, 1, 2, ..., N-1, 0, 1, ...
* **Capacity:** Can store a maximum of **N - 1** elements.

### Pseudocode for Circular Queue
**Size and Empty Algorithms:**
```text
Algorithm size()
    return (N - f + r) mod N

Algorithm isEmpty()
    if f == r
        return true
    return false
```

**Enqueue Algorithm:**
```text
Algorithm enqueue(o)
    if size() == N - 1 then
        return Error (Overflow)
    Q[r] <- o
    r <- (r + 1) mod N
```

**Dequeue Algorithm:**
```text
Algorithm dequeue()
    if isEmpty() then
        return Error (Underflow)
    o <- Q[f]
    Q[f] <- null
    f <- (f + 1) mod N
    return o
```

---

## 5. Deque (Double Ended Queue)
A Deque is a linear queue that allows both insertion and deletion from **both** ends of the list (front or rear).

**Variations of Deque:**
1. **Input Restricted Deque:** Insertions are only allowed from one end, but deletions can happen from both ends.
2. **Output Restricted Deque:** Insertions are allowed from both ends, but deletion can only happen from one end.

---

## 6. Applications of Queues
Queues are widely used in scenarios where tasks must be managed in the exact order they arrive:
* **Operating Systems:** Multi-programming OS task management.
* **CPU Scheduling:** FIFO scheduling algorithms.
* **Tree Traversals:** Breadth-first traversal (BFS) of a Tree.
* **Print Spooling:** Managing a printer job pool.
```
