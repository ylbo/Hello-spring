package cn.springDAO.xml;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;


@SpringJUnitConfig
class App{

    @Autowired
    private EmployeeInterface proxy;

    @Test
    void testSave(){
        Employee employee = new Employee();
        employee.setName("乔峰");
        employee.setAge(30);
        proxy.save(employee);
    }

    @Test
    void testUpdate(){
        Employee employee=new Employee();
        employee.setName("西门吹雪");
        employee.setAge(40);
        employee.setId(9L);
        proxy.update(employee);
    }

    @Test
    void testDelete(){
        proxy.delete(10L);
    }

    @Test
    void testGet(){
        Employee e = proxy.get(99L);
        System.out.println(e);
    }

    @Test
    void testListAll(){
        List<Employee> list = proxy.listAll();
        for(Employee e:list){
            System.out.println(e);
        }
    }
}
