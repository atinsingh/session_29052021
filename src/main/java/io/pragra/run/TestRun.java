package io.pragra.run;

import io.pragra.employee.*;

public class TestRun {
    public static void main(String[] args) {
       Person p1 = new Person("A");
    }

    public static void printSalary(Person person){
        System.out.println("Person " + person.getName() + " has salary " + person.calculateSalary());
        System.out.println("----");
    }

}
