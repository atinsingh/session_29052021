package io.pragra.employee;

public class Employee extends Person{
    private double hourlyRate;

    public Employee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hourlyRate*8*20;
    }
}
