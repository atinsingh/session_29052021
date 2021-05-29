package io.pragra.employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double hourlyRate, double bonus) {
        super(name, hourlyRate);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
