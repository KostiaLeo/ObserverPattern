/**
 * Created by Kostia on 06.10.2019.
 */
public class PhoneDisplay implements IObserver{
    private int temp = 0;
    WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        temp = station.getTemperature();
    }
}
