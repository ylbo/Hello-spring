package cn.springIoc.register.dao;

import cn.springIoc.register.domain.User;
import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAOImp implements UserDAO{

    @Setter
    private DataSource dataSource;

    @Override@SneakyThrows
    public void save(User user){
        @Cleanup
        Connection conn= dataSource.getConnection();
        String sql="insert into student(name,age) value(?,?)";
        @Cleanup
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user.getName());
        ps.setInt(2,user.getAge());
        ps.executeUpdate();

    }
}
