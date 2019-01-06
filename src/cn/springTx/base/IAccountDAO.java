package cn.springTx.base;

public interface IAccountDAO {

    void transOut(Long OutId,int money);

    void transIn(Long InId, int money);
}
