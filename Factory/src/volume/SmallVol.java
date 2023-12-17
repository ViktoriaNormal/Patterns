package volume;

public class SmallVol implements Volume {
    @Override
    public float getPriceAffection() {
        return (float) 0.5;
    }

    @Override
    public String getSize() {
        return "0.33л";
    }
}
