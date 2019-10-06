/**
 * Created by Kostia on 06.10.2019.
 */
public interface IObservable {
    void add(IObserver o);
    void remove(IObserver o);
    void notifying();
}