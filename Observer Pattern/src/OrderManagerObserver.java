import java.util.ArrayList;
import java.util.List;

class OrderManagerObserver {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addOrder(Order order) {
        notifyObservers("New order added: " + order.getDetails());
    }
}
