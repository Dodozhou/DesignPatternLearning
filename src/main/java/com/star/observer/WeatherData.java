package com.star.observer;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements DataSubject {
    String temperature;
    String humidity;
    private List<DataObserver> observers;

    public WeatherData() {
        observers = new ArrayList<DataObserver>();
    }

    public void registOb(DataObserver observer) {
        observers.add(observer);
    }

    public void removeOb(DataObserver observer) {
        int i=observers.indexOf(observer);
        observers.remove(i);
    }

    public void notifyObs() {
        for (DataObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void dataChanged(String teper,String huimi) {
            temperature=teper;
            humidity=huimi;
            notifyObs();
    }
}
