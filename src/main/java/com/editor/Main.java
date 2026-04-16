package com.editor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

//@EnableAutoConfiguration
//@Component
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication springApplication=new SpringApplication(Main.class);
        ConfigurableApplicationContext configurableApplicationContext=springApplication.run();
//        HelloWorld helloWorld=configurableApplicationContext.getBean(HelloWorld.class);


    }
}