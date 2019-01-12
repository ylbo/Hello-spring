package core._3_Bean_Scopes._1_The_Singleton_Scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Singleton d1;
    @Autowired
    private Singleton d2;
    @Autowired
    private Singleton d3;


    @Test
    void testSingleton(){
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
