package EmployeeManagementSystem;
import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private HashMap<Integer, EmployeeModel> employees = new HashMap<>();

    public void addEmployee(String name, int id, double baseSalary) {
        try {
            addCheckEmployee(id);
            employees.put(id, new Intern(name, baseSalary));
        } catch (EmployeeAlreadyExistingException nee) {
            System.out.println("Invalid: " + nee.getMessage());
        }
    }

    public void addEmployee(String name, int id, double baseSalary, String department){
        try {
            CheckDeptEmployee(name, id, baseSalary, department);
        } catch (InvalidDepartmentException ide) {
            System.out.println("Invalid: "  + ide.getMessage());
        } catch (EmployeeAlreadyExistingException eae) {
            System.out.println("Invalid: " + eae.getMessage());
        }
    }

    public void removeEmployee(int id){
        try {
            checkEmployee(id);
            employees.remove(id);
        } catch (NoEmployeeException nee) {
            System.out.println("Employee No." + id + " could not be removed." + nee.getMessage());
        }
    }

    public void calculateSalary(int id) {
        try {
            checkEmployee(id);
            for (Map.Entry<Integer,EmployeeModel> entry : employees.entrySet()) {
                if (entry.getKey() == id) {
                    System.out.println(entry.getValue().calculateSalary());
                }
            }
        } catch (NoEmployeeException nee) {
            System.out.println("Salary could not be calculated: " + nee.getMessage());
        }
    }

    public void getEmployee(int id) {
        try {
            checkEmployee(id);
            for (Map.Entry<Integer,EmployeeModel> entry : employees.entrySet()) {
                if (entry.getKey() == id) {
                    System.out.println("Employee No." + id + ": " + entry.getValue().getName());
                }
            }
        } catch (NoEmployeeException nee) {
            System.out.println("Employee No." + id + " could not be displayed." + nee.getMessage());
        }
    }

    public void displayEmployeeInfo(int id) {
        try {
            checkEmployee(id);
            System.out.println(employees.get(id));
        } catch (NoEmployeeException nee) {
            System.out.println("Employee No." + id + " could not be displayed." + nee.getMessage());
        }
    }

    public void checkEmployee(int id) throws NoEmployeeException {
        if (!employees.containsKey(id)) {
            throw new NoEmployeeException("This employee is not found");
        }
    }
    public void addCheckEmployee(int id) throws EmployeeAlreadyExistingException {
        if (employees.containsKey(id)) {
            throw new EmployeeAlreadyExistingException("There is an existing employee with this ID");
        }
    }

    public void CheckDeptEmployee(String name, int id, double baseSalary, String department) throws InvalidDepartmentException, EmployeeAlreadyExistingException {
        addCheckEmployee(id);
        if (department.equalsIgnoreCase("manager")) {
            employees.put(id, new Manager(name, baseSalary));
        } else if (department.equalsIgnoreCase("developer")) {
            employees.put(id, new Developer(name, baseSalary));
        } else if (department.equalsIgnoreCase("tester")) {
            employees.put(id, new Tester(name, baseSalary));
        } else {
            throw new InvalidDepartmentException("This department is not valid");
        }
    }


    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeModel> entry : employees.entrySet()){
            System.out.println("Id: " + entry.getKey() + " " +  entry.getValue() );
        }
    }

}
