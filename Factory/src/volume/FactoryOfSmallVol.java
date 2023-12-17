package volume;

public class FactoryOfSmallVol extends FactoryOfVolume {

    @Override
    public Volume setVolume() {
        return new SmallVol();
    }
}
