package cn.springAOP.xml;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig
class App{

    @Autowired
    private EmployeeInterface proxy;

    @Test
    void testSave(){
        proxy.save(new Employee());
    }

    @Test
    void testUpdate(){
        proxy.update(new Employee());
    }
}
