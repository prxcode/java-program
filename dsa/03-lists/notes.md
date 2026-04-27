# Lists

## 1. Introduction to Lists
A list is a collection of elements that form a linear sequence. 
* **Core Operations:** Insert, delete, update (at any position), search, and traverse.
* **Implementation Types:** Can be implemented using Arrays or Linked Lists.

---

## 2. Arrays vs. Linked Lists

### Limitations of Array-Based Lists
* **Fixed Size:** Not flexible; cannot easily grow or shrink dynamically.
* **Contiguous Memory:** Physically stored in consecutive memory locations, requiring a single large chunk of memory.
* **Costly Operations:** Inserting or deleting items often requires shifting subsequent data elements, which is time-consuming.

### Advantages of Linked Lists
* **Dynamic Sizing:** Can grow and shrink dynamically at runtime as memory is allocated only when needed.
* **Non-Contiguous Memory:** Items do not need to be stored in consecutive memory locations.
* **Efficient Operations:** Insertions and deletions can be performed by updating pointers without shifting data.

---

## 3. Singly Linked List (SLL)
A linked list consisting of nodes where each node points only to the next node.
* **Traversal:** Unidirectional (one direction only).
* **Node Structure:** * `Element/Data`
  * `Pointer` to the next node (or `NULL` if it's the last node).

### Implementation Variables
* `count`: Number of items currently in the list (Initial value: 0).
* `start`: Pointer marking the first node in the list (Initial value: `NULL`).
* `index`: Zero-based index (First element = 0, Last element = count - 1).

### Insertion Algorithm (SLL)
```text
Algorithm Insert(start, x, index):
1. If index > count: Return "Invalid Index"
2. If start == null (List is empty):
    a. Create new node, set data = x, next = null
    b. start = new
3. Else If index == 0 (Insert at beginning):
    a. Create new node, set data = x
    b. new->next = start
    c. start = new
4. Else (Insert in middle or end):
    a. Create new node, set data = x
    b. temp = start, i = 0
    c. Loop while i < (index - 1):
        temp = temp->next
        i = i + 1
    d. new->next = temp->next
    e. temp->next = new
5. count = count + 1
```

### Deletion Algorithm (SLL)
```text
Algorithm Delete(start, index):
1. If index >= count: Return "Invalid Index"
2. If count == 1 (Only one element):
    a. temp = start, start = null
    b. Free(temp)
3. Else If index == 0 (Delete first element):
    a. temp = start
    b. start = temp->next
    c. Free(temp)
4. Else (Delete middle or end):
    a. temp = start, i = 0
    b. Loop while i < (index - 1):
        temp = temp->next
        i = i + 1
    c. temp1 = temp->next
    d. temp->next = temp1->next
    e. Free(temp1)
5. count = count - 1
```

### Other SLL Operations
* **isEmpty():** Returns true if `count == 0`.
* **Size():** Returns the value of `count`.
* **Find(e):** Performs a linear search from `start` to the end. Returns the index if found, else returns `-1`.

---

## 4. Doubly Linked List (DLL)
A linked list where each node maintains pointers to both the next and previous nodes.
* **Traversal:** Bidirectional (both directions).
* **Node Structure:**
  * `Pointer` to the previous node.
  * `Element/Data`
  * `Pointer` to the next node.

### Insertion Algorithm (DLL)
```text
Algorithm Insert(start, x, index):
1. If index > count: Return "Invalid Index"
2. If start == null:
    a. Create new node, set data = x, prev = null, next = null
    b. start = new
3. Else If index == 0:
    a. Create new node, set data = x
    b. new->next = start
    c. start->prev = new
    d. new->prev = null
    e. start = new
4. Else:
    a. Create new node, set data = x
    b. temp = start, i = 0
    c. Loop while i < (index - 1):
        temp = temp->next
        i = i + 1
    d. new->prev = temp
    e. new->next = temp->next
    f. if (temp->next != null): (new->next)->prev = new
    g. temp->next = new
5. count = count + 1
```

### Deletion Algorithm (DLL)
```text
Algorithm Delete(start, index):
1. If index >= count: Return "Invalid Index"
2. If count == 1:
    a. temp = start, start = null, Free(temp)
3. Else If index == 0:
    a. temp = start
    b. start = temp->next
    c. start->prev = null
    d. Free(temp)
4. Else:
    a. temp = start, i = 0
    b. Loop while i < (index - 1):
        temp = temp->next
        i = i + 1
    c. temp1 = temp->next
    d. temp->next = temp1->next
    e. if (temp1->next != null): (temp1->next)->prev = temp
    f. Free(temp1)
5. count = count - 1
```

---

## 5. Circular Linked Lists
* **Singly Circular List:** The `next` pointer of the last node points back to the `start` node instead of `NULL`, forming a closed loop.
* **Doubly Circular List:** The `next` pointer of the last node points to the `start` node, and the `prev` pointer of the `start` node points to the last node.

---

## 6. Applications of Linked Lists
* Implementing other fundamental data structures like **Stacks** and **Queues**.
* Implementing complex, non-linear data structures like **Trees** and **Graphs**.
