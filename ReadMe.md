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
### Access Modifier
<ol>
    <li>public</li>
    <li>private</li>
    <li>protected</li>
    <li>default</li>
</ol>

<table>
    <tr>
        <th></th>
        <th>default</th>
        <th>private</th>
        <th>protected</th>
        <th>public</th>
    </tr>
    <tr>
        <td>Same Class</td>
        <td>Yes</td>
        <td>Yes</td>
        <td>Yes</td>
        <td>Yes</td>
    </tr>
 <tr>
        <td>SubClass - same package</td>
        <td>Yes</td>
        <td>No</td>
        <td>Yes</td>
        <td>Yes</td>
    </tr>
 <tr>
        <td>SubClass - different package</td>
        <td>No</td>
        <td>No</td>
        <td>Yes</td>
        <td>Yes</td>
    </tr>
<tr>
        <td>Another class - in same package</td>
        <td>Yes</td>
        <td>No</td>
        <td>Yes</td>
        <td>Yes</td>
    </tr>
<tr>
        <td>Another class - in different package</td>
        <td>No</td>
        <td>No</td>
        <td>No</td>
        <td>Yes</td>
    </tr>
</table>


### Task
Create a class Employee 
add member variable 
double hourlyRate;
// horlyRate*8*20
public double calSalary(){
}
create class Manager extend 
// double bonus 

overide calSalary() 
to include bonus component 

create class CxO extend Manager
// double incentives

overide calSalary()
to include inventive component 

// object employee, manager, cxo 
call calculate salary and see if you can get right result. 

### Abstract Classes 
SQL - MYSQL, ORACLE, POSTGRES, SQLSEVER, 
NOSQL - MongoDB
example :
 in order to insert in mongo db 
 connect.save(document)
 in other hand my in sql
  
   connect.runSQl("insert into table values()")
// Dialect 

#### abstract methods 
Abstract method are the method without implementation 
mean method declared without body

You can't create a instance of an abstract class. 
