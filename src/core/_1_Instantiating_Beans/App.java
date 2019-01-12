package core._1_Instantiating_Beans;

import core._1_Instantiating_Beans._1_Instantiation_with_a_Constructor.Cat1;
import core._1_Instantiating_Beans._2_Instantiation_with_a_Static_Factory_Method.Cat2;
import core._1_Instantiating_Beans._3_Instantiation_by_Using_an_Instance_Factory_Method.Cat3;
import core._1_Instantiating_Beans._4_Instantiation_by_implements_FactoryBean.Cat4;
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
