package cn.springTx.TxManagerWithJavaConfig;

public interface IAccountDAO {

    void transOut(Long OutId, int money);

    void transIn(Long InId, int money);
}
