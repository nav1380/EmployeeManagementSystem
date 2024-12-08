package EmployeeManagementSystem;

public class Manager extends EmployeeModel {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary, "Manager");
    }

    @Override
    double calculateSalary() {
        return baseSalary + (baseSalary * 0.20);
    }
}
