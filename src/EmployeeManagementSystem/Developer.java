package EmployeeManagementSystem;

public class Developer extends EmployeeModel  implements Trainable {

    public Developer(String name, double baseSalary) {
        super(name, baseSalary, "Developer");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 500;
    }

    @Override
    public void attendTraining() {
        System.out.println("Developer is now attending training");
    }
}
