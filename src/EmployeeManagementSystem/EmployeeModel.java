package EmployeeManagementSystem;

public abstract class EmployeeModel {

    protected String name;
    protected double baseSalary;
    protected String department;

    public EmployeeModel(String name, double baseSalary, String department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "name=" + name +
                ", baseSalary=" + baseSalary +
                ", department='" + department + '\'' +
                '}';
    }
}

