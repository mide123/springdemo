package com.dls;

import com.dls.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartAction {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        HelloService helloService = context.getBean("helloService",HelloService.class);
        helloService.hello();
    }
}
