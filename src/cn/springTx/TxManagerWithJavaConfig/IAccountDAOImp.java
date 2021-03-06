package cn.springTx.TxManagerWithJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class IAccountDAOImp implements IAccountDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public void transOut(Long OutId, int money) {
        jdbcTemplate.update("update account set balance= balance - ? where id=?", money, OutId);
    }

    @Override
    public void transIn(Long InId, int money) {
        jdbcTemplate.update("update account set balance= balance + ? where id=?", money, InId);

    }
}
