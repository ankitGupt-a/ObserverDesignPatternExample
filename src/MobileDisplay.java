public class MobileDisplay implements Observer{
    private double temperature;
    private final WeatherStation weatherStation;

    public MobileDisplay(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        temperature = weatherStation.getTemperature();
        System.out.println("Mobile display: Current temperature is: " + temperature);
    }
}
