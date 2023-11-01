package ma.youcode;


import ma.youcode.configuration.AppConfig;
import ma.youcode.domain.Employee;
import ma.youcode.repository.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application
{

    public static void main(String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        employeeRepository.save(Employee.builder().name("test").build());
    }
}
