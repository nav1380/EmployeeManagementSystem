package EmployeeManagementSystem;

public class EmployeeAlreadyExistingException extends Exception {
    public EmployeeAlreadyExistingException(String message) {
        super(message);
    }
}
