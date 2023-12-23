package beverage;

public abstract class Beverage {
    String description = " ";
    double volume = 0.4;

    public String getDescription() {
        return description;
    }

    public abstract int cost();

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
