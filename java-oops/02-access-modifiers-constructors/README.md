# Access modifiers & Constructors 

### Access Modifiers 
Specifier where a property/method is accessible. There are four types of access modifiers in Java.
1. Private
2. Default
3. Protected
4. Public

### Getters and Setters
- Getter -> Returns the value [accessors]
- Setter -> Sets/Updates the value [mutators]
  
Example:   
```java
public class Emplyoee{
    private int id;
    private String name;
     
    public String getName(){
        return name;
    }

    public void SetName(){
        this.name = "Your name";
    }

    public void SetName(String n){
        this.name = n;
    }
}
```

### Constructors in Java
A member function used to initialize an object while creating it.

```java
Employee prx = new Employee();
prx.SetName("Priyanshu");
```

In order to write our own constructor, we define a method with name same as class name.
```java
public Employee(){
    name="Priyanshu";
}
```
### Constructor Overloading in Java
Constructors can be overloaded just like other methods in Java. We can overload the Employee constructor like below:
```java
public Employee(String n){
    name = n;
}
```

#### Note
1. Constructors can take parameters without being overloaded.
2. There can be more than two overloaded constructors.
   ---
