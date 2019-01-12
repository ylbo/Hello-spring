package core._7_AOP._1_staticProxy;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig
class App{

    @Autowired
    private EmployeeServiceProxy employeeService;

    @Test
    void testSave(){
        employeeService.save(new Employee());
    }

    @Test
    void testUpdate(){
        employeeService.update(new Employee());
    }
}
