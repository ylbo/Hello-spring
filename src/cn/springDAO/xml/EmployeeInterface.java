package cn.springDAO.xml;


import java.util.List;

public interface EmployeeInterface {
    void save(Employee employee);

    void update(Employee employee);

    void delete(Long id);

    Employee get(Long id);

    List<Employee> listAll();

}
