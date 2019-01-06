package cn.springTx.TxManagerWithAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IAccountServiceImp implements IAccountService {

    @Autowired
    public void setDao(IAccountDAOImp dao) {
        this.dao = dao;
    }

    private IAccountDAOImp dao;

    @Override
    public void trans(Long InId, Long OutId, int money) {
        dao.transOut(OutId,money);
        //int i = 1/0; // 模拟程序和异常
        dao.transIn(InId,money);
    }
}
