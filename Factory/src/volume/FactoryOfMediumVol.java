package volume;

public class FactoryOfMediumVol extends FactoryOfVolume{

    @Override
    public Volume setVolume() {
        return new MediumVol();
    }
}
