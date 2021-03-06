package com.maoding.coreUtils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Wuwq on 2016/12/1.
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        applicationContext = ctx;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

/***** 强制转换有警告，不再提供只根据名字获取Bean的方法，获取Bean时必须要指定类型 */
//    public static <T> T getBean(String name) throws BeansException {
//        return (T) applicationContext.getBean(name);
//    }

    public  static <T> T getBean(String name,Class<T> aClass) throws BeansException {
        return applicationContext.getBean(name,aClass);
    }

    public  static <T> T getBean(Class<T> aClass) throws BeansException {
        return applicationContext.getBean(aClass);
    }
}
