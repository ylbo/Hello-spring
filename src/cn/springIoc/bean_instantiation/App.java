package cn.springIoc.bean_init;

import cn.springIoc.bean_init._01_constructor.Cat1;
import cn.springIoc.bean_init._02_static_factory.Cat2;
import cn.springIoc.bean_init._03_instance_factory.Cat3;
import cn.springIoc.bean_init._04_factory_bean.Cat4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Cat1 c1;
    @Autowired
    private Cat2 c2;
    @Autowired
    private Cat3 c3;
    @Autowired
    private Cat4 c4;

    @Test
    void testCat(){
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
