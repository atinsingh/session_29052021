## Inheritance
Inheritance allow to inherit properies of parent/super class to 
child class.

-- What can't be inherited
   - private member 
   - static member 
   - constructor 
## De-tour 
## Packages 
1. Package is used to group the related classes
2. It also gives unique name for your class. 

Naming convention 
packages are always names in small-cases 
it normally written as reverse order of public identiy.project

example:

    public identity is pragra.io and project empmanagement 
    package wold be 
    io.pragra.empmanagement

    public identity is ibm.com and project ai
    package wold be
    com.ibm.ai


## Rule
You can assign an object of child class to a referece of 
parent class 

Example 
````java
class A {
    
}
class B extends A{
    
}
class C extends B{
    
}

class Solution {
    public static void main(String[] args) {
        A obj = new C();
        B obj = new C();
        A obj = new B();
    }
}
````
