package com.an.antry.spring.appcontext;

import java.util.Date;

public interface WeatherDAO {
    WeatherData find(Date date);

    WeatherData save(Date date);

    WeatherData update(Date date);
}
