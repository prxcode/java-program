# String
A string is a sequence of characters, a string is initiated as follows:-
```java
string name;
name = new string("prx");
```
String is a class but can be used like a data type.
```java
string name = "prx"
```

### Different ways to print in Java
We can use the following ways to print in java:
- System.out.print() -> no newline at the end
- System.out.println() -> Prints a new line at the end
- System.out.printf()
- System.out.format()

System.out.printf("%c", ch)
here:
- %d is for int
- %f is for float
- %c is for char
- %s is for string

### String Methods
String Methods operate on Java strings. They can be used to find length of the string, convert to lowercase etc. Some of the commonly used string methods are:
- String name = "Priyanshu"

- `name.length()` = Returns length of the string name 
- `name.tolower()` = Returns a new string which has all the lowercase characters from string name
- `name.toupper()` = Returns a new string which has all the uppercase characters from string name
- `name.trim()` = Returns a new string after removing all the leading and trailing spaces from the orginal string
- `name.substring(int start)` = Returns a new substring from start to the end substring returns "yanshu"
- name.substring(int start, int end) = Returns a substring from start index to the end index. Start index is included and end is excluded
- `name.replace(P, B)` = Returns a new string after replacing P with B. Briyanshu is returned in this case
- `name.StartsWith("Pri")` = Returns true if name starts with string "Pri". True in this case
- `name.EndsWith("shu")` = Returns true if name ends with string "shu". True in this case
- `name.charAt(2)` = Returns character at a given index position i in this case
- `name.indexOf(i)` = Returns the index of the given string which is 2 here.
- `name.indexOf("s", 3)` = Returns index of s starting from index 3 to -1 
- `name.lastIndexOf("s")` = Returns the last index of the given string basically last time where the character is
- `name.lastIndexOf("s", 2)` = Returns the last index of the given string before index 2
- `name.equals("Priyanshu")` = Returns true if the given string is equal to "Priyanshu" true for this case 
- `name.equalsIgnoreCase("priyanshu") = Returns true if the given string is equal to "PriYanShu" no matter the case

### Escape Sequence Characters
- Sequence of characters after backslash '\' = escape sequence characters. 
- Escape Sequence characters consist of more than one characters but represents one character when used within the strings.
- Example: \n, \t, \',\\