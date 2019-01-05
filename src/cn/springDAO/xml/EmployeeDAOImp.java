package cn.springDAO.xml;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDAOImp implements EmployeeInterface {
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public void save(Employee employee) {
        jdbcTemplate.update("insert into employee(name,age) value (?,?)", employee.getName(), employee.getAge());
    }

    @Override
    public void update(Employee employee) {
        jdbcTemplate.update("update employee set name = ?,age = ? where id = ?",
                employee.getName(),
                employee.getAge(),
                employee.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("delete from employee where id = ?", id);
    }

    @Override
    public Employee get(Long id) {
        // 使用queryForObject 如果没有对象那个会抛出异常的 处理异常比较麻烦
        //推荐使用 查询所有结果 ，如果没有返回null，有返回第一个
//        return this.jdbcTemplate.queryForObject(
//                "select id,name,age from employee where id = ?",
//                new Object[]{id},
//                new EmployeeMapper());
        List<Employee> list = jdbcTemplate.query("select id,name,age from employee where id = ?",
                new Object[]{id},
                new EmployeeMapper());

        return list.size()==0? null:list.get(0);
    }

    @Override
    public List<Employee> listAll() {
        return jdbcTemplate.query("select id,name,age from employee",
                new EmployeeMapper());
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {

        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee e = new Employee();
            e.setId(rs.getLong("id"));
            e.setName(rs.getString("name"));
            e.setAge(rs.getInt("age"));
            return e;
        }
    }
}
