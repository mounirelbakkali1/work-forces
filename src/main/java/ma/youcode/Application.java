package ma.youcode;


import ma.youcode.configuration.AppConfig;
import ma.youcode.configuration.SpringDataJpaConfig;
import ma.youcode.domain.Employee;
import ma.youcode.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application
{

    public static void main(String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, SpringDataJpaConfig.class);
        String[] beans = context.getBeanDefinitionNames();
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeService.class);
        //employeeService.addNewEmployee(Employee.builder().name("test").build());
        System.out.println("employeeService = " + employeeService.getAllEmployees());
    }
}
