public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileDisplay = new MobileDisplay(weatherStation);
        Observer watchDisplay = new WatchDisplay(weatherStation);

        weatherStation.addObserver(mobileDisplay);
        weatherStation.addObserver(watchDisplay);

        weatherStation.setTemperature(25);

        weatherStation.removeObserver(watchDisplay);

        weatherStation.setTemperature(30);
    }
}
