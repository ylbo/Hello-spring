package core._7_AOP._4_Annotation_based;

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
