package cn.springAnnotations.register.server;

import cn.springAnnotations.register.dao.UserDAOImp;
import cn.springAnnotations.register.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Server {
    @Autowired
    private UserDAOImp userDAOImp;

    public void regiser(User user){
        userDAOImp.save(user);
    }
}
