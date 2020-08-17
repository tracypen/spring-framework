package com.hp.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

/**
 * FactoryBean本身就是一个比较特殊的bean；
 * FactoryBean可以通过它的接口定义来生产一个普通bean；
 * FactoryBean的beanName就是它生产的普通bean的beanName加一个“&”前缀，这也间接说明普通bean不可以使用“&”作为beanName的前缀，否则在启动时，容器会报错。
 *
 * Spring是如何集成Mybatis的，它其实就是通过SqlSessionFactoryBean作为入口的，而SqlSessionFactoryBean其实就是一个FactoryBean。
 * 利用它屏蔽了Mybatis底层的复杂构建。如果工作中也有遇到类似的场景的话，可以借鉴此思路。
 *
 * @date 2020-08-07 10:52
 */
@Service
public class TestFactoryBean implements FactoryBean<TestUserService> {

    @Override
    public TestUserService getObject() throws Exception {
        System.out.println("创建TestUserServiced对象");

        return new TestUserService();
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("返回TestUserService.class类型");
        return TestUserService.class;
    }
}
