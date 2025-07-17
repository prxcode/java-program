# Conditionals in Java
In java decisions which depends on a certain codition being met, we can execute instructions on a condition being met.

### Decision making instructions in java
- if-else statement
- switch statement
  

### If else statement
The syntax of an if-else statement in C looks like that of C++ and JavaScript. Java has a similar syntax too. It looks like:
```java
if (condition-to-be-checked){
    statements-of-condition-true;
}
else {
    statements-if-condition-false;
}
```

```java
if a = 29;
if (a>18){
    System.out.println("you can code!");
}
```
> else block is only executed when if is not satisfied

### Relational Operators 
Relational operators are used to evaluate conditions (true or false) inside the if statements Some examples of relational operators are:
- == , >=, <=, <, >, !=
> '=' is used for assignment where as '==' is used for equality check. The condition can be either true or false


### Logical Operators 
&&, || and ! are most commonly used logical operators in java. These are read as:
- && -> AND
- || -> OR
- ! -> NOT

- **AND Operator**: Evaluates to true if both the conditions are true.
- **OR Operator**: Evaluates to true when at least one of the conditions is true.
- **NOT Operator**: Oppose the logic here true becomes false and false become true.

### else if clause
- Instead of using multiple if statements, we can also use else if along with if thus forming an if-else-if-else ladder.
- Using such kind of logic reduces indents. last else is executed only if all the conditions fail.
```java
if (condition){
    // statements;
}
else if {
    // statements;
}
else {
    // statements;
}
```

### Switch Case Control Instruction
Switch case is used when we have to make a choice between number of alternatives for a given variable.

```java
switch(var){
    case c1:
        // code;
        break;
    case c2:
        // code 
        break;
    case c3:
        // code
        break
    default:
        // code
}
```

Var can be an integer character or string in java. A switch can occur within another but in practice this is rarely done.