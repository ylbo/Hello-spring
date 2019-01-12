package core._7_AOP._4_Annotation_based;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Manager {

    @Pointcut("execution(* core._7_AOP._4_Annotation_based.EmployeeDAOImp.*(..))")
    private void txPoint() {
    }

    long startTime;

    @Before("txPoint()")
    public void begin() {
        System.out.println("开启事务");
        startTime = System.currentTimeMillis();
    }

    @After("txPoint()")
    public void commit() {
        System.out.println("提交事务");
    }

    @AfterThrowing(value = "txPoint()", throwing = "e")
    public void rollback(Exception e) {
        System.out.println("回滚事务");
    }

    @AfterReturning("txPoint()")
    public void end() {
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("释放资源");
    }


    public Object around() {
        Object reslut = null;
        startTime = System.currentTimeMillis();
        System.out.println("开启事务");
        try {
            System.out.println("提交事务");
            System.out.println(System.currentTimeMillis() - startTime);
        } catch (Exception e) {
            System.out.println("滚回事务");
        } finally {
            System.out.println("释放资源");
        }
        return null;
    }
}
