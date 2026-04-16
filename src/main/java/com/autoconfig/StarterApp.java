package com.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class StarterApp implements CommandLineRunner {

    @Autowired
    WebApplicationContext webApplicationContext;
    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(StarterApp.class);
//        ConfigurableApplicationContext configurableApplicationContext=springApplication.run();
//        SpringBootCourse sp=configurableApplicationContext.getBean(SpringBootCourse.class);
//        sp.showSpringBootCourseDetails();
        springApplication.run();
    }
    // 1

    public void run(String... args) throws Exception
    {
        SpringBootCourse sp=webApplicationContext.getBean(SpringBootCourse.class);
        sp.showSpringBootCourseDetails();
    }
    //2

    //3
}
