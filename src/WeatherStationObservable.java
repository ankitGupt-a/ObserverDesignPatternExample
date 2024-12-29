public interface WeatherStationObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
