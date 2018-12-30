IOC容器
    
    调用者只负责去IOC容器中取对象，不关心对象的创建过程，
    也不关心对该对象依赖对象的创建以及依赖的关系的组装，
    也就是把创建对象的控制权反转给了spring框架

BeanFactory和ApplicationContext的不同

    运行PersonTest比较结果
    
    结论
        使用testApplicationContext
        在创建spring容器时，立马初始化容器中管理的bean，不会到获取bean时才去初始化
    
        使用BeanFactory
        BeanFactory具有延迟初始化；懒加载，在创建spring容器时，
        不会立马去创建容器中管理的bean对象，而是要等到要从容其中获取对象才去创建对象
xml标签变量控制是否延迟初始化
    
    在bean标签中设置 default-lazy-init的属性，默认使用false，表示不延迟初始化，
    设置为true表示延迟初始化