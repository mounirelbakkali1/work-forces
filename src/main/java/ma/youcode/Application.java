package ma.youcode;


import ma.youcode.service.EmployeeService;
import ma.youcode.service.Impl.RHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application
{

    private static EmployeeService employeeServiceBean;
    private static EmployeeService employeeServiceBean2;

    @Autowired
    public Application(@Qualifier("employeeService") EmployeeService employeeServiceBean1,
                       @Qualifier("employeeService") EmployeeService employeeServiceBean2) {
        Application.employeeServiceBean = employeeServiceBean1;
        Application.employeeServiceBean2 = employeeServiceBean2;
    }

    public static void main(String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        EmployeeService employeeService2 = context.getBean("employeeService", EmployeeService.class);
        EmployeeService rHService = context.getBean("rhService", RHService.class);


        employeeService.getEmployeeFirstName();
        rHService.getEmployeeFirstName();

        employeeServiceBean.getEmployeeFirstName();

        System.out.println(employeeService);
        System.out.println(employeeService2);
        System.out.println(employeeServiceBean);
        System.out.println(employeeServiceBean2);
    }
}
