package core._7_AOP._1_staticProxy;


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
