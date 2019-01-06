package cn.springTx.TxManagerWithAnnotations;

public interface IAccountService {

    void trans(Long InId, Long OutId, int money);
}
