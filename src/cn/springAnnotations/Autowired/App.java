package cn.springAnnotations.Autowired;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringJUnitConfig
@Component
@Service
@Controller
@Repository
class App{

    @Autowired
    private Cat cat1;

    @Autowired
    @Qualifier("cat2")
    private Cat cat3;

    @Test
    @PreDestroy
    @PostConstruct
    void testCat1(){
        System.out.println(cat1);
        System.out.println("--------------------------------------------------------------");
        System.out.println(cat3);
    }

}
