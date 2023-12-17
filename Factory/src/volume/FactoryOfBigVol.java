package volume;

public class FactoryOfBigVol extends FactoryOfVolume {

    @Override
    public Volume setVolume() {
        return new BigVol();
    }
}
