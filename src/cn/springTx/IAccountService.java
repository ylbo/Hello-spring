package cn.springTx;

public interface IAccountService {

    void trans(Long InId,Long OutId,int money);
}
