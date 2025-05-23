package dev.mrcabbagestick;

import java.util.ArrayList;

public abstract class Notifier<T> {
    private final ArrayList<Observer<T>> observers = new ArrayList<>();

    protected void updateAll(){
        for(var observer : observers)
            observer.update(getSelf());
    }

    protected abstract T getSelf();

    public void registerObserver(Observer<T> observer){
        observers.add(observer);
    }

    public void unregisterObserver(Observer<T> observer){
        observers.remove(observer);
    }
}
