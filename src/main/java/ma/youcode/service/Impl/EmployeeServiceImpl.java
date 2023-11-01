package ma.youcode.service.Impl;

import lombok.RequiredArgsConstructor;
import ma.youcode.domain.Employee;
import ma.youcode.repository.EmployeeRepository;
import ma.youcode.service.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
@Qualifier("employeeServiceImpl")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository ;
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
        Objects.requireNonNull(employee);
        Objects.requireNonNull(employee.getName());
        Employee saved = employeeRepository.save(employee);
        System.out.println("saved = " + saved);
    }


    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}
