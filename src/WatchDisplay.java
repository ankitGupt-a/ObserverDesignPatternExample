public class WatchDisplay implements Observer{
    private final WeatherStation weatherStation;
    private double temperature;

    public WatchDisplay(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        temperature = weatherStation.getTemperature();
        System.out.println("Watch display, current temperature is: " + temperature);
    }
}
