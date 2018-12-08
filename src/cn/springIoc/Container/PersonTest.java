package cn.springIoc.Container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class PersonTest {

    /* 使用BeanFactory
    结论：BeanFactory具有延迟初始化；懒加载，在创建spring容器时，不会立马去创建容器中管理的bean对象
   ，而是要等到要从容其中获取对象才去创建对象
    程序结果
    构建Person....................
    -------------------------------
    cn.springIoc.Person@6580cfdd
    */
    @Test
    void testBeanFactory() {
        Resource resource = new ClassPathResource("cn/springIoc/Container/Container.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println("-------------------------------");
        Person p = beanFactory.getBean("person", Person.class);
        System.out.println(p);
    }

    /* 使用testApplicationContext
    在创建spring容器时，立马初始化容器中管理的bean，不会到获取bean时才去初始化
    输出结果
    构建Person....................
    -------------------------------
    cn.springIoc.Person@6580cfdd
    * */
    @Test
    void testApplicationContext () {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/springIoc/Container/Container.xml");
        System.out.println("-------------------------------");
        Person p = ctx.getBean("person", Person.class);
        System.out.println(p);
    }
}