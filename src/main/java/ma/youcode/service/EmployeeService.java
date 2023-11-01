package ma.youcode.service;


import ma.youcode.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public String getEmployeeFirstName();
    public String getEmployeeLastName();
    public void addNewEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
