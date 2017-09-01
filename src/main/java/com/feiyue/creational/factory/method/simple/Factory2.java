package com.feiyue.creational.factory.method.simple;

/**
 * 1.创建型设计模式之简单工厂模式
 * 角色：简单工厂类
 * 作用：使用反射的方式创建具体产品
 * @author: liangpengju
 * @date: 2017/8/30
 * @version: 1.0
 */
public class Factory2 {

    /**
     * 静态工厂方法，创建各种各样的水果
     * @param clazz
     * @return
     */
    public static IFruit createFruit(Class clazz){
        IFruit iFruit = null;
        try {
            //根据类名创建一个实例
            iFruit= (IFruit) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("实例对象初始化异常");
        } catch (IllegalAccessException e) {
            System.out.println("安全权限访问异常");
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到具体的产品类");
        }
        return iFruit;
    }

}





















