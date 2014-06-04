package com.an.antry.spring.da.ox.jaxb;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JaxbApp {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-jaxb.xml");
        // CastorApp application = (CastorApp) appContext.getBean("castorApp");
    }
}
