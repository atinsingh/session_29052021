package io.pragra.employee;
// Is -A relationship
public class Employee extends Person {
    private int employeeId;

    public Employee(String name, Address address, int employeeId) {
        super(name, address);
        this.employeeId = employeeId;
    }

    @Override
    public void work(){
        System.out.println("Doing Job");
    }
}
