package store;

import java.util.LinkedList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers;
    public Observable(){
        observers = new LinkedList<Observer>();
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer:
             observers) {
            observer.update();
        }
    }
}
