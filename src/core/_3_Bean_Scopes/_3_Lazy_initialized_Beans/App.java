package core._3_Bean_Scopes._3_Lazy_initialized_Beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Lazy d1;

    @Test
    void testPrototype(){
        System.out.println(d1);
    }
}
