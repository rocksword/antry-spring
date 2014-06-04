package com.an.antry.spring.appcontext;

public class WeatherData {
    private double high;

    public WeatherData() {
    }

    public WeatherData(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "WeatherData [high=" + high + "]";
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
