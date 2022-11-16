package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppForDiSet {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openUrl("http://pan.baidu.com/haha", "root ");
        System.out.println(flag);
    }
}
