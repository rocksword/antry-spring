package com.an.antry.spring.appcontext;

import java.util.Date;

public class WeatherServiceImpl implements WeatherService {

    private WeatherDAO weatherDao;

    public void setWeatherDao(WeatherDAO weatherDao) {
        this.weatherDao = weatherDao;
    }

    public Double getHistoricalHigh(Date date) {
        WeatherData wd = weatherDao.find(date);
        if (wd != null)
            return new Double(wd.getHigh());
        return null;
    }
}
