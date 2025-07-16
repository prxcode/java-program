# Operators and Expressions 
Operators are used to perform operations on variable and values.
Ex: 7 + 11 = 18 (here 7, 11 are operand and + is operator and 18 is result)

### Types of Operators
- Arithmetic Operators -> +, -, *, /, %, ++, --
- Assignment Operators -> =, +=, -=
- Comparison Operators -> ==, >=, <=
- Logical Operators -> &&, ||, !
- Bitwise Operators -> %,| (operates bitwise)

Arithmetic Operators cannot word with booleans % operator can word on floats & doubles.

### Precedence of Operators
The Operators are applied and evaluated based on precedence. For example (+, -) has less precedence compared to (*, /). Hence * & / are evaluated first. In case we like to change this order, we use parenthesis aka bracket.

### Associativity
Associativity tells the directinon of execution of operators. It can either be left to right or right to left
- * / -> L to R
- + - -> L to R
- ++ = -> R to L

### Resulting data type after arithmetic operation
Following table summarize the resulting data type after arithmetic operation on them
- byte + short = int
- short + int = int
- long + float = float
- int + float = float
- character + int = int
- character + short = int
- long + double = double 
- float + double = double
  
### Increment and Decrement Operators 
a++, ++a = Increment operator
a--, --a = Decrement operator

These will operate on all data types except booleans

a++ = first use the value and then increment
++a = first increment the value the use it