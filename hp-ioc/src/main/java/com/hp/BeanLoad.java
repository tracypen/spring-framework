package com.hp;

import com.hp.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author haopeng
 * @date 2020-07-16 09:53
 */
public class BeanLoad {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User bean = applicationContext.getBean("user", User.class);
        bean.sayHello();
    }
}
