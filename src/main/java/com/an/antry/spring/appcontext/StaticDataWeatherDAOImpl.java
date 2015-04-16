package com.an.antry.spring.appcontext;

import java.util.Date;

public class StaticDataWeatherDAOImpl implements WeatherDAO {
    public WeatherData find(Date date) {
        WeatherData wd = new WeatherData(11.11111);
        return wd;
    }

    public WeatherData save(Date date) {
        return null;
    }

    public WeatherData update(Date date) {
        return null;
    }
}
