package Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Transactional
public class App {

    @Autowired
    private UserImp userImp;

    private static User user =new User("root","123456");

    @Before
    //@Commit
    public void createOne(){
        userImp.create(user);
    }

    @Test(expected = org.springframework.dao.DuplicateKeyException.class)
    public void create() {
        userImp.create(user);
    }

    @Test
    public void ifUserNameExist() {
        assert userImp.ifUserNameExist("root");
    }

    @Test
    public void checkAccountAndPassword() {
        assert userImp.checkAccountAndPassword(user);
    }


}
