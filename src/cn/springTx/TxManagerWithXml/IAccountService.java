package cn.springTx.TxManagerWithXml;

public interface IAccountService {

    void trans(Long InId, Long OutId, int money);
}
