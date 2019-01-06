package cn.springTx.TxManagerWithXml;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class IAccountDAOImp implements IAccountDAO {

    private JdbcTemplate jdbcTemplate;

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
