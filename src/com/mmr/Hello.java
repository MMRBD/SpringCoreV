package com.mmr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean; 

public class Hello{

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
//    @PostConstruct
//    public void init(){
//        System.out.println("Start");
//    }
//    @PreDestroy
//    public void end(){
//        System.out.println("End");
//        
//    }
    
}
