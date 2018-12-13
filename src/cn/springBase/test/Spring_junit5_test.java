package cn.springBase.test;

import cn.springBase.bean.HelloWorld;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// spring5的测试单元
//TODO tips： junit5的包是否导入，test的导入的包名跟junit4的不同，
//  junit4的包名是 org.junit.Test
//  junit5的包名是  org.junit.jupiter.api.Test
//  使用junit5时 public可以省去
//  ContextConfiguration可以不用，存在跟测试类相同目录的 ”测试类名-context.xml“ 文件可以自动加载配置文件
@SpringJUnitConfig
@ContextConfiguration("classpath:cn/springBase/bean/HelloWorld3.xml")
class Spring_junit5_test {

    // 按照类型自动获取对象（所以导入的HelloWorld3.xml如果导入另外两个文件，由于另外两个中存在多个同一个类的对象会报错）
    @Autowired
    private HelloWorld world;
    //Autowired 不仅能按照类型自动获取对象 还能能注入容器对象
    @Autowired
    private BeanFactory beanFactory;
    @Autowired
    private ApplicationContext ctx;

    @Test
    void HelloWorldTest(){
        System.out.println(world.getMessage());
        System.out.println(ctx);
        System.out.println(beanFactory);
    }
}
