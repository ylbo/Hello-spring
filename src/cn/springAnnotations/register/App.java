package cn.springAnnotations.register;

import cn.springAnnotations.register.domain.User;
import cn.springAnnotations.register.server.Server;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig
class App{

    @Autowired
    Server server;
    @Autowired
    User user;

    @Test
    void test()throws Exception{
        server.regiser(user);
    }
}
