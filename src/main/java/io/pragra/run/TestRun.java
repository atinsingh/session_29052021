package io.pragra.run;

import io.pragra.employee.CxO;
import io.pragra.employee.Employee;
import io.pragra.employee.Manager;
import io.pragra.employee.Person;

public class TestRun {
    public static void main(String[] args) {
            printSalary(new Person("Cleber"));
            printSalary(new Employee("Jas", 50));
            printSalary(new Manager("Athira", 50, 1000));
            printSalary(new CxO("Anila", 50, 1000, 1000));
    }

    public static void printSalary(Person person){
        System.out.println("Person " + person.getName() + " has salary " + person.calculateSalary());
        System.out.println("----");
    }

}
