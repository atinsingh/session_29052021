# Task 1 
create a class Person

```java
class Person {
    public void greet() {
        //
    }
}

interface IGreet {
    default void greet() {
        //
    }
}
interface IAdvanceGreet {
    default void greet() {
        //
    }
}

class Employee implements IGreet, IAdvanceGreet {
    
}
//  When method has been implemented by 2 interfaces, 
///java will force to override 

class TestRun{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.greet();
    }
}
```

## Task 2 
create functional interface 
```java
interface IGreet{
    String greet();
}

// write a lambda implentation of greet

interface IWage{
    double calcSalaray(double hourlyRate, int hours);
}
// Create lamda for it 

// write FI
interface Accept{
    void accept(Object item);
}
// create lambda with method reference 
// look any method with similar implemtation 
// hint ..println

```
