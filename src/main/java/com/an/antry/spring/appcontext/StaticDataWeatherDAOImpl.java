package com.an.antry.spring.appcontext;

import java.util.Date;

public class StaticDataWeatherDAOImpl implements WeatherDAO {
    @Override
    public WeatherData find(Date date) {
        WeatherData wd = new WeatherData(11.11111);
        return wd;
    }

    @Override
    public WeatherData save(Date date) {
        return null;
    }

    @Override
    public WeatherData update(Date date) {
        return null;
    }
}
