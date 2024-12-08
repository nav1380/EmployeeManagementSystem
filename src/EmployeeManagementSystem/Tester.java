package EmployeeManagementSystem;

public class Tester extends EmployeeModel {
    public Tester(String name, double baseSalary) {
        super(name, baseSalary, "Tester");
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }
}
