package cn.springIoc.bean_create_and_destroy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Test
    void testOld(){
        // 创建对象
        MyDataSource ds=new MyDataSource();
        // 立马创建对象做初始化
        ds.open();

        ds.doWork();

        // 进行销毁扫尾工作
        ds.close();
    }

    @Autowired
    private MyDataSource dataSource;

    @Test
    void testIOC(){
        dataSource.doWork();
    }
}
