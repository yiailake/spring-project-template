package com.shiyan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Service
public class SpringTest {


    @Test
    public void testSpring() {
        // 获取应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取SprintTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.sayHello();
    }

    public void sayHello() {
        System.out.println("hello shiyan");
    }
}
