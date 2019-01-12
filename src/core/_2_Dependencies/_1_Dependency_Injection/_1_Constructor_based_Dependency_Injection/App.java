package core._2_Dependencies._1_Dependency_Injection._1_Constructor_based_Dependency_Injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{
    @Autowired
    private SimpleMovieLister simpleMovieLister;

    @Test
    void test(){
        System.out.println(simpleMovieLister);
    }
}
