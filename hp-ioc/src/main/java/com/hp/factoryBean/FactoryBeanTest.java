package com.hp.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haopeng
 * @date 2020-08-07 10:57
 */
public class FactoryBeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] factoryBeanNames = applicationContext.getBeanNamesForType(TestFactoryBean.class);
        String[] serviceNames = applicationContext.getBeanNamesForType(TestUserService.class);

        TestFactoryBean myDemoFactoryBean = applicationContext.getBean(TestFactoryBean.class);
        System.out.println(myDemoFactoryBean);

        System.out.println(applicationContext.getBean("&testFactoryBean").getClass().getSimpleName());
        System.out.println(applicationContext.getBean("testFactoryBean").getClass().getSimpleName());
        //
        //System.out.println(Arrays.toString(factoryBeanNames));
        //System.out.println(Arrays.toString(serviceNames));
    }

}
