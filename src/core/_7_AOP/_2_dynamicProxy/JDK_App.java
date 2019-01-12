package core._7_AOP._2_dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK_App {
    public interface IService {
        void sayHello();
    }

    static class RealService implements IService {
        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler {

        private Object realObj;


        SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering" + method.getName());
            Object reslut = method.invoke(realObj, args);
            System.out.println("leaving" + method.getName());
            return reslut;
        }
    }

    public static void main(String[] args)throws Exception {
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        IService realService = new RealService();
        IService proxy = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class<?>[]{IService.class},
                new SimpleInvocationHandler(realService));
        proxy.sayHello();
        Class<?> temp=proxy.getClass();
        System.out.println(new Class<?>[]{IService.class}.equals(IService.class.getInterfaces()));
    }

}
