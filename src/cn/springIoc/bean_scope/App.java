package cn.springIoc.bean_scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Dog d1;
    @Autowired
    private Dog d2;
    @Autowired
    private Dog d3;


    @Test
    void testCat(){
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
