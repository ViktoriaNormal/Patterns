package volume;

public class BigVol implements Volume {

    @Override
    public float getPriceAffection() {
        return (float) 1.5;
    }

    @Override
    public String getSize() {
        return "0.5л";
    }
}
