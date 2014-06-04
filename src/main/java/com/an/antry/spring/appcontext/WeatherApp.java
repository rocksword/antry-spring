package com.an.antry.spring.appcontext;

import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WeatherApp {
    public static void main(String[] args) {
        startBySpring();

        // startByJavaApi();
    }

    private static void startByJavaApi() {
        WeatherDAO dao = new StaticDataWeatherDAOImpl();
        WeatherServiceImpl ws = new WeatherServiceImpl();
        ws.setWeatherDao(dao);

        Date time = new GregorianCalendar(2004, 0, 1).getTime();
        Double high = ws.getHistoricalHigh(time);
        System.out.println(high);
    }

    private static void startBySpring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-appcontext.xml");
        WeatherService ws = (WeatherService) ctx.getBean("weatherService");

        Date time = new GregorianCalendar(2004, 0, 1).getTime();
        Double high = ws.getHistoricalHigh(time);
        System.out.println(high);
    }
}
