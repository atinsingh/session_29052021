package io.pragra.employee;

public class Manager extends Employee{
    public Manager(String name, Address address, int employeeId) {
        super(name, address, employeeId);
    }

    @Override
    public void work() {
        System.out.println("Just chilling and passing order");
    }
}
