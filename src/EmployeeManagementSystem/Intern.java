package EmployeeManagementSystem;

import EMP.Part2.Trainable;

public class Intern extends EmployeeModel implements Trainable {

    public Intern(String name, double baseSalary) {
        super(name, baseSalary, "Intern");
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 0.50;
    }

    @Override
    public void attendTraining() {
        System.out.println("Intern is now attending training");
    }
}
