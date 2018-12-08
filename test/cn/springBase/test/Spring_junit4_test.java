package cn.springBase.test;

import cn.springBase.bean.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// spring4的测试单元
// 改变junit的运行Runner，使用spring提供的
@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置对象（用于寻找配文件，记得加classpath）
@ContextConfiguration("classpath:cn/springBase/bean/HelloWorld3.xml")
public class Spring_junit4_test {

    // 按照类型自动获取对象（所以导入的HelloWorld3.xml如果导入另外两个文件，由于另外两个中存在多个同一个类的对象会报错）
    @Autowired
    private HelloWorld world;

    @Test
    public void HelloWorldTest(){
        System.out.println(world.getMessage());
    }
}
