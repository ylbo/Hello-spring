package cn.springAOP.staticProxy;


//静态代理类
public class EmployeeServiceProxy implements EmployeeInterface {

    //private EmployeeServiceImp target;//代理对象

    private EmployeeDAOImp target;

    private Manager manager;

    public void setTarget(EmployeeDAOImp target) {
        this.target = target;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void save(Employee employee) {
        manager.begin();
        try {
            target.save(employee);
            //dao.save(employee);
            manager.commit();
        }catch (Exception e){
            e.printStackTrace();
            manager.rollback();
        }
    }

    @Override
    public void update(Employee employee) {
        manager.begin();
        try {
            target.update(employee);
            //dao.update(employee);
            manager.commit();
        }catch (Exception e){
            e.printStackTrace();
            manager.rollback();
        }
    }
}
