package com.star.observer;

import java.util.Observable;



public class CurrentWeatherBoard implements DataObserver {
    DataSubject weatherData;

    public CurrentWeatherBoard(DataSubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registOb(this);
    }

    public void update(String temperature, String humidity) {
        System.out.println("Current WeatherData:");
        System.out.println("Temperature: "+temperature);
        System.out.println("Humidity:"+humidity);

    }
}
