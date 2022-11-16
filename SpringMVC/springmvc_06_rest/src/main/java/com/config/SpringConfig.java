package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.service","com.dao"})
@ComponentScan(value = "com",
        excludeFilters = @ComponentScan.Filter(
            type =  FilterType.ANNOTATION,
            classes = Controller.class
        )
)
public class SpringConfig {

}