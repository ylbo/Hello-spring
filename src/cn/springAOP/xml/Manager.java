package cn.springAOP.xml;

public class Manager {


    long startTime;

    public void begin(){
        System.out.println("开启事务");
        startTime=System.currentTimeMillis();
    }

    public void commit() {
        System.out.println("提交事务");
    }

    public void rollback(Exception e){
        System.out.println("回滚事务");
    }

    public void end(){
        System.out.println(startTime - System.currentTimeMillis());
        System.out.println("释放资源");
    }

    public Object around(){
        Object reslut=null;
        startTime=System.currentTimeMillis();
        System.out.println("开启事务");
        try {
            System.out.println("提交事务");
            System.out.println(startTime - System.currentTimeMillis());
        }catch (Exception e){
            System.out.println("滚回事务");
        }finally {
            System.out.println("释放资源");
        }
        return null;
    }
}
