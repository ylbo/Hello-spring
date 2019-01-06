package cn.springTx.TxManagerWithJavaConfig;

public interface IAccountService {

    void trans(Long InId, Long OutId, int money);
}
