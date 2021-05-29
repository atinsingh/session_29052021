package io.pragra.employee;

// Concrete
public class CxO extends Manager{
    private double incentive;

    public CxO(String name, double hourlyRate, double bonus, double incentive) {
        super(name, hourlyRate, bonus);
        this.incentive = incentive;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + incentive;
    }
}
