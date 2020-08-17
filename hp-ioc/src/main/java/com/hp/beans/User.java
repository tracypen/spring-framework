package com.hp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author haopeng
 * @date 2020-07-16 10:02
 */
public class User implements BeanNameAware, BeanFactoryAware, InitializingBean {
    private String name;

    public void sayHello() {
        System.out.println("hello: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        User suer = beanFactory.getBean("user", User.class);
        System.out.print("=============");
        System.out.println(suer);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("==============Bean name " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===========执行afterPropertiesSet");
    }
}
