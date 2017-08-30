package com.feiyue.factory.spring;

/**
 * 模仿Spring的Bean工厂接口
 */
public interface BeanFactory {
    Object getBean(String id);
}
