package core._3_Bean_Scopes._2_The_Prototype_Scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Prototype d1;
    @Autowired
    private Prototype d2;
    @Autowired
    private Prototype d3;


    @Test
    void testPrototype(){
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
