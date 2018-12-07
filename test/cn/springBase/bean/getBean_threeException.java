package cn.springBase.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class getBean_threeException {
    //TODO  getBean常见的三种使用方式  和 三种常见异常错误
    // 三种使用方式
    // 1.IOC 通过id 获取bean （id不能重复，也不能指定不存在的id）
    // 2. 通过 类型获取 bean （只适用于一个类只创建一个对象 如果创建多个就报错）
    // 3. 通过 id + 类型 获取bean 就是 getBean 填两个参数 （推荐使用）

    //TODO 三种常见异常 全部执行可以看到具体异常
    @Test
    public void Exception1() throws Exception {
        HelloWorld world = null;
        Resource resource = new ClassPathResource("cn/springBase/bean/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        // TODO
        //  常见异常1：NoSuchBeanDefinitionException：No bean named 'HelloWorld2' available
        //  解释： HelloWorld2 id并不存在
        world = (HelloWorld) factory.getBean("HelloWorld2");
        System.out.println(world.getMessage());
    }

    @Test
    public void Exception2() throws Exception {
        HelloWorld world = null;

        Resource resource = new ClassPathResource("cn/springBase/bean/getBeanException.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        //TODO
        //  上面是从getBeanException.xml中加载的
        //  常见异常2：BeanDefinitionParsingException: Configuration problem: Bean name 'HelloWorld' is already used in this <beans> element
        //  解释：HelloWorld 已经被使用了
        world = (HelloWorld) factory.getBean("HelloWorld");
        System.out.println(world.getMessage());
    }

    @Test
    public void Exception3() throws Exception {
        HelloWorld world = null;
        Resource resource = new ClassPathResource("cn/springBase/bean/beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        // TODO
        //  常见异常3：NoUniqueBeanDefinitionException:No qualifying bean of type 'HelloWorld' available:
        //  expected single matching bean but found 2: HelloWorld,HelloWorld3
        //  解释；获取bean时候 希望获取类型唯一的一个bean，但是找到了两个
        //  在beans.xml 中多个类的名称是HelloWorld
        world = (HelloWorld) factory.getBean(HelloWorld.class);
        System.out.println(world.getMessage());
    }
}
