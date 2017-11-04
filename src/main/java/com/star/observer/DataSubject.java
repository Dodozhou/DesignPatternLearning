package com.star.observer;

public interface DataSubject {
     void registOb(DataObserver observer);
     void removeOb(DataObserver observer);
     void notifyObs();
     void dataChanged(String teper,String huimi);
}
