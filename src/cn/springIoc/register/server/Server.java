package cn.springIoc.register.server;

import cn.springIoc.register.dao.UserDAOImp;
import cn.springIoc.register.domain.User;
import lombok.Setter;

public class Server {
    @Setter
    private UserDAOImp userDAOImp;

    public void regiser(User user){
        userDAOImp.save(user);
    }
}
