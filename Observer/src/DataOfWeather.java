import java.util.ArrayList;
import java.util.List;

public class DataOfWeather implements Subject {

    private List<DisplayElement> data;

    public DataOfWeather() {
        data = new ArrayList<DisplayElement>();
    }

    public Integer getTemperatureNow() {
        return 18;
    }

    public Integer getPressureNow() {
        return 72;
    }

    public Integer getHumidityNow() {
        return 764;
    }

    public Integer getTemperatureFuture() {
        return 19;
    }

    public Integer getPressureFuture() {
        return 70;
    }

    public Integer getHumidityFuture() {
        return 760;
    }

    public Integer getTemperaturePast() {
        return 22;
    }

    public Integer getPressurePast() {
        return 65;
    }

    public Integer getHumidityPast() {
        return 755;
    }

    @Override
    public void addObserver(Observer screen) {
        data.add((DisplayElement) screen);
    }

    @Override
    public void removeObserver(Observer screen) {
        data.remove((DisplayElement) screen);
    }

    @Override
    public void notifyObservers() {
        data.forEach(DisplayElement::update);
    }
}
