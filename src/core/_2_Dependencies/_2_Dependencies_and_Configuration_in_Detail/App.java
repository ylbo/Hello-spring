package core._2_Dependencies._2_Dependencies_and_Configuration_in_Detail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
class App{

    @Autowired
    private Straight_Values straightValues;

    @Autowired
    private References_Values referencesValues;

    @Autowired
    private Collection_Values collectionBean;



    @Test
    void testCat(){
        System.out.println(referencesValues);
        System.out.println(straightValues);
        System.out.println(collectionBean);
    }
}
