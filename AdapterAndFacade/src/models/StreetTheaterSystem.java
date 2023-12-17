package models;

public class StreetTheaterSystem {

    private boolean isEnable = false;
    private static final StreetTheaterSystem instance = new StreetTheaterSystem();
    private final DVDPlayer dvdPlayer = DVDPlayer.getInstance();
    private final Projector projector = new Projector();
    private final SurroundSoundSystem surroundSoundSystem = SurroundSoundSystem.getInstance();
    private final Screen screen = new Screen();

    public static StreetTheaterSystem getInstance() {
        return instance;
    }

    public void playMovie(String movieTitle) {
        screen.down();
        projector.turnOn();
        projector.tvMode();
        projector.wideScreenMode();
        surroundSoundSystem.setStereoSound(true);
        surroundSoundSystem.setVolume(10);
        dvdPlayer.turnOn();
        dvdPlayer.play();

    }

    public void stopMovie() {
        dvdPlayer.stop();
    }

    public void turnOff(){
        isEnable = false;
        projector.turnOff();
        screen.up();
        surroundSoundSystem.turnOff();
        dvdPlayer.turnOff();
    }
}
