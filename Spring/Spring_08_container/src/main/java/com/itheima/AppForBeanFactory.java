package com.itheima;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {

        Resource resourse;
        BeanFactory bf = new XmlBeanFactory(resourse);
    }
}
