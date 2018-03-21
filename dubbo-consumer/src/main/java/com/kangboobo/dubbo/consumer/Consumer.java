package com.kangboobo.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kangboobo.dubooDemo.api.HelloService;

/**
 * 服务消费方：调用服务
 * @author kangboobo
 *
 */
public class Consumer {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();

        System.out.println("服务消费方调用服务开始：");

        HelloService helloService = (HelloService) context.getBean(HelloService.class);

        System.out.println(helloService.sayHello("Kangboobo"));

    }
}
