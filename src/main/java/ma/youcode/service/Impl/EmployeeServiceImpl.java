package ma.youcode.service.Impl;

import ma.youcode.domain.Employee;
import ma.youcode.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String getEmployeeFirstName() {
        System.out.println("EmployeeServiceImpl.getEmployeeFirstName");
        return null;
    }

    @Override
    public String getEmployeeLastName() {
        return null;
    }

    @Override
    public void addNewEmployee(Employee employee) {

    }
}
