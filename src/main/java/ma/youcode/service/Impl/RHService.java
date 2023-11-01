package ma.youcode.service.Impl;

import ma.youcode.domain.Employee;
import ma.youcode.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RHService implements EmployeeService {
    @Override
    public String getEmployeeFirstName() {
        System.out.println("RHService.getEmployeeFirstName");
        return null;
    }

    @Override
    public String getEmployeeLastName() {
        return null;
    }

    @Override
    public void addNewEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

}
