package cn.springIoc.bean_setter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Employee employee;

    @Autowired
    private Cat cat;

    @Autowired
    private CollectionBean collectionBean;

    @Autowired
    private Dog dog;

    @Test
    void testCat(){
        System.out.println(cat);
        System.out.println(employee);
        System.out.println(collectionBean);
        System.out.println(dog);
    }
}
