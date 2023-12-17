package volume;

public class MediumVol implements Volume{

    @Override
    public float getPriceAffection() {
        return (float) 1;
    }

    @Override
    public String getSize() {
        return "0.4л";
    }
}
