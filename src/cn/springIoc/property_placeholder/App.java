package cn.springIoc.property_placeholder;

import lombok.Cleanup;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@SpringJUnitConfig
class App{

    @Autowired
    private DataSource dataSource;

    @Test@SneakyThrows
    void test(){
        @Cleanup
        Connection conn = dataSource.getConnection();
        @Cleanup
        PreparedStatement ps = conn.prepareStatement("select id,name,age from student");
        @Cleanup
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.print(rs.getLong("id") + ",");
            System.out.print(rs.getString("name") + ",");
            System.out.println(rs.getLong("age") + ",");
        }
    }
}
