package com.mmr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mmr/SpringConfig.xml");
        //context.registerShutdownHook();
//        Hello hello = (Hello) context.getBean("hello");
//        hello.setMessage("Hello Spring...");
//        System.out.println(hello.getMessage());

//        Hello hello1 = (Hello) context.getBean("hello");
//        //hello1.setMessage("hello Spring 2");
//        System.out.println(hello1.getMessage());



    Employee ee = (Employee) context.getBean("e");
    ee.show();
    
    }
}
