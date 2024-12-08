package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) throws InvalidDepartmentException {
        EmployeeManager emp = new EmployeeManager();
        emp.addEmployee("Joshua", 1, 10000, "MaNaGeR");
        emp.displayAllEmployees();
    }
}
