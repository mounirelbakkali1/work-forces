package ma.youcode;

import ma.youcode.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class ApplicationTest

{
    @Autowired @Qualifier("employeeService")
    private EmployeeService employeeService;


    @Test
    public void testApp()
    {
        String employeeFirstName = employeeService.getEmployeeFirstName();
        assertNull(employeeFirstName);
    }
}
