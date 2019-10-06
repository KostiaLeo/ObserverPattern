import java.util.ArrayList;

/**
 * Created by Kostia on 06.10.2019.
 */
public class WeatherStation implements IObservable {
    private ArrayList<IObserver> observers = new ArrayList<>();
    private int temperature = 0;
    @Override
    public void add(IObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifying() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
