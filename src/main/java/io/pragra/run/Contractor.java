package io.pragra.run;

import io.pragra.employee.Address;
import io.pragra.employee.Person;

public class Contractor extends Person {
    public Contractor(String name, Address address) {
        super(name, address);
    }

    public void printVal(){
        System.out.println(nickName);
    }
}
