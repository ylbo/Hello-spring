package core._4_Customizing_the_Nature_of_a_Bean;

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
