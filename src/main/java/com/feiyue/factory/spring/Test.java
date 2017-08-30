package com.feiyue.factory.spring;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) throws Exception {
        BeanFactory f = new ClassPathXmlApplicationContext("factory/applicationContext.xml");
        Object o = f.getBean("car");
        Moveable m = (Moveable)o;
        m.run();
    }
}
