package cn.springBase.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.reflect.Constructor;


public class HelloWorldTest {
    @Test
    public void testIoc() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("" +
                "cn/springBase/bean/beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorld");
        System.out.println(helloWorld.getMessage());
    }

    @Test
    public void testIoc_old() throws Exception {
        HelloWorld world = null;
        // 1.从classpath路径去找配置文件，创建资源对象
        Resource resource = new ClassPathResource("cn/springBase/bean/beans.xml");
        // 2. 根据资源对象，创建spring IOC 容器
        BeanFactory factory = new XmlBeanFactory(resource);
        // 3. 从spring ioc容器中去出指定名称（HelloWorld）的对象
        world = (HelloWorld) factory.getBean("HelloWorld");
        System.out.println(world.getMessage());
    }

    // 模拟实现spring ioc容器操作
    @Test
    public void testIocMock() throws Exception {
        HelloWorld world = null;
        String className = "cn.springBase.bean.HelloWorld";
        // 使用反射实现对象
        Class clzz = Class.forName(className);
        Constructor constructor = clzz.getConstructor();
        Object obj = constructor.newInstance();
        // 使用内省机制设置属性值

        world = (HelloWorld) obj;
        // ----------------------------------------------------
        System.out.println(world.getMessage());
    }
}