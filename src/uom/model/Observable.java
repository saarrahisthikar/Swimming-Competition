package uom.model;

import java.util.List;
/**
 * 
 * 
 */
public interface Observable {

    public abstract void addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public abstract void notifyObservers(List<Observer> observers);
}
