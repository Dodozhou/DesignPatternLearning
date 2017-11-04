package com.star.observer;

public class TestObserverPattern {
    public static void main(String[] args) {
        DataSubject weather=new WeatherData();
        DataObserver current=new CurrentWeatherBoard(weather);
        DataObserver forecast=new ForecastWeatherBoard(weather);

        weather.dataChanged("36℃","79");
    }
}
