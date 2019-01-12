package cn.springIoc.bean_setter;

public class Cat {
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "References_Values{" +
                "employee=" + employee +
                '}';
    }
}
