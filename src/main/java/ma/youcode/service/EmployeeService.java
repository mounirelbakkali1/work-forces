package ma.youcode.service;


import ma.youcode.domain.Employee;

public interface EmployeeService {
    public String getEmployeeFirstName();
    public String getEmployeeLastName();
    public void addNewEmployee(Employee employee);
}
