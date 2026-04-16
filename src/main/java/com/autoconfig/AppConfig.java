package com.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class AppConfig {
    @Bean

    public SpringBootCourse springBootCourse()
    {
        return new SpringBootCourse();
    }

}
