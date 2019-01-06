package cn.springTx.TxManagerWithJavaConfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
class App{

    @Autowired
    private IAccountService proxy;

    @Test
    void testTrans(){
        proxy.trans(10010L,10086L,1000);
    }
}
