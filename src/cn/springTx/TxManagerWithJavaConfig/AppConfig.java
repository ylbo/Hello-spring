package cn.springTx.TxManagerWithJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//当前项目的配置文件 好比是applicationContext.xml
@Configuration//表示当前类为一个配置类
//导入别的配置文件
@Import(DataSourceConfig.class)// 导入其他配置类
@ComponentScan              //相当于IoC注解解析器
@EnableTransactionManagement//相当于事务注解解析器
public class AppConfig {
    //添加事务管理的bean
    @Bean
    public DataSourceTransactionManager create(DataSource ds){
        return new DataSourceTransactionManager(ds);
    }
}
