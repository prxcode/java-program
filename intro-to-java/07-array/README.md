# Array
Array is a collection of similar types of data
- Use case: storing marks of 5 Students
- int[]marks = new int[5]


# Accessing Array Elements
Array elements can be accessed as follows
- marks[0] = 100
- marks[1] = 70
- marks[2] = 98 

Basically, this is how array works:
- 1. int[] marks;
- 2. int[] marks = new int[5];
- 3. int[] marks = {100,70,80,71,98}

Array indices starts from 0 and goes till(n-1) where n is the size of the array

### Array length
Array have a length property which gives the length of the array. (marks.length) -> 5 if marks is a reference to array with 5 elements

### Displaying an array
An array can be displlayed using a for loop:
```java
for(int i=0; i<marks.length; i++)
{
    System.out.println(marks[i]) //Array Traversal
}
```

### Multidimensional Arrays
Multidimensional Arrays are array of arrays each element of a M-D array is an array itself marks in the previous example was 1-D array.

### Multidimensional 2-D Arrays
A 2-D array can be created as follows:
- int[][] flats = new int[2][3]
- We can add elements to this array as follows 
- flats[0][0] = 100
- flats[0][1] = 101
- flats[0][2] = 102

This 2-D array can be visualized as follows:
|      | Col1  | Col2  | Col3  |
| ---- | ----- | ----- | ----- |
| Row1 | (0,0) | (0,1) | (0,2) |
| Row2 | (1,0) | (1,1) | (1,2) |

Similarly, a 3-D array can be created as follows:
- String[][][]arr = newString[2][3][4]