package com.editor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springb {

    @RequestMapping("/hello")
    public HelloWorld show()
    {
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setWord1("Hello");
        helloWorld.setWord2("World");

        return helloWorld;
    }


}
