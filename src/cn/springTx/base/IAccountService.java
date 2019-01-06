package cn.springTx.base;

public interface IAccountService {

    void trans(Long InId,Long OutId,int money);
}
