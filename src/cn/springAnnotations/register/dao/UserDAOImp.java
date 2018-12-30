package cn.springAnnotations.register.dao;

import cn.springAnnotations.register.domain.User;
import lombok.Cleanup;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
public class UserDAOImp implements UserDAO {

    @Autowired
    private DataSource dataSource;

    @Override
    @SneakyThrows
    public void save(User user) {
        @Cleanup
        Connection conn = dataSource.getConnection();
        String sql = "INSERT INTO student(name,age) value(?,?)";
        @Cleanup
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setInt(2, user.getAge());
        ps.executeUpdate();

    }
}
