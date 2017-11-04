package com.star.observer;


public class ForecastWeatherBoard implements DataObserver {
    private DataSubject weatherData;//之所以持有该对象，是方便将来注销观察者之用。

    ForecastWeatherBoard(DataSubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registOb(this);
    }
    public void update(String temperature, String humidity) {
        System.out.println("Forecast WeatherData: Improveing Weather on the way!");

    }
}
