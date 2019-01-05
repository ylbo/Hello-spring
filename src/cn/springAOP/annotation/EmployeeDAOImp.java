package cn.springAOP.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImp implements EmployeeInterface {
    @Override
    public void save(Employee employee) {
        System.out.println("保存员工");
    }

    @Override
    public void update(Employee employee) {
        System.out.println("修改员工");
    }
}