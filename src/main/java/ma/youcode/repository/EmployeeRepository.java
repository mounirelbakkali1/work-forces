package ma.youcode.repository;

import ma.youcode.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
