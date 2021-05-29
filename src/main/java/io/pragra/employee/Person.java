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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void eat(){
        System.out.println(nickName);
        System.out.println("Eating");
    }
}
