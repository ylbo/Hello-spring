package cn.springIoc.bean_create_and_destroy;

public class MyDataSource {

    public MyDataSource(){
        System.out.println("创建对象");
    }

    public void open(){
        System.out.println("开启资源");
    }

    public void doWork(){
        System.out.println("工作");
    }

    public void close(){
        System.out.println("释放");
    }

}
