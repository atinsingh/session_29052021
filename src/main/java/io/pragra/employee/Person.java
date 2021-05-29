package io.pragra.employee;
// Composition
public class Person {
    protected String nickName ="Java";
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void work(){
        System.out.println("Learning at Home");
    }




}
