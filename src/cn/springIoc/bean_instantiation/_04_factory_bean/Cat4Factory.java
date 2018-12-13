package cn.springIoc.bean_init._04_factory_bean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {

    private String userName;

    public void setUserName(String userName){
        this.userName=userName;
    }

    // 工厂方法
    @Override
    public Cat4 getObject() throws Exception {
        System.out.println(userName);
        Cat4 c4 = new Cat4();


        return c4;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat4.class;
    }

    // true 表示永远创建单例
    // false 关闭单例
    @Override
    public boolean isSingleton() {
        return true;
    }

}
