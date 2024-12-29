import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherStationObservable{
    private final List<Observer> observerList = new ArrayList<>();
    private double temperature;

    public void addObserver(final Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    public void removeObserver(final Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (final Observer observer: observerList) {
            observer.update();
        }
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }
}
