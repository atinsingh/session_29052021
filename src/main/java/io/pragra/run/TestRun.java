package io.pragra.run;

import io.pragra.employee.Address;
import io.pragra.employee.Employee;
import io.pragra.employee.Manager;
import io.pragra.employee.Person;

public class TestRun {
    public static void main(String[] args) {
        //
        Person person = new Person("Akash", new Address("TopFlight Dr","Mississauga"));
        Employee p  = new Employee("Anila",new Address("main st","brampton"),2);;

        getWork(new Manager("Akash",null,2));

    }

    public static void getWork(Person obj){
        obj.work();
    }
}
