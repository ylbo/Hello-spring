package cn.springTx;

public class IAccountServiceImp implements IAccountService {

    public void setDao(IAccountDAOImp dao) {
        this.dao = dao;
    }

    private IAccountDAOImp dao;

    @Override
    public void trans(Long InId, Long OutId, int money) {
        dao.transOut(OutId,money);
        dao.transIn(InId,money);
    }
}
