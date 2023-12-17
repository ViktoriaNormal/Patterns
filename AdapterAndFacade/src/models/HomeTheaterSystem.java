package models;

public class HomeTheaterSystem {

    private boolean isEnable = false;
    private final DVDPlayer dvdPlayer = DVDPlayer.getInstance();
    private final Projector projector = new Projector();
    private final Lights lights = new Lights();
    private final SurroundSoundSystem soundSystem = SurroundSoundSystem.getInstance();
    private final Screen screen = new Screen();
    private static final HomeTheaterSystem instance = new HomeTheaterSystem();

    public void turnOn() {
        isEnable = true;
    }

    public static HomeTheaterSystem getInstance() {
        return instance;
    }

    public void playMovie(String movieTitle) {
        lights.turnOff();
        screen.down();
        projector.turnOn();
        projector.tvMode();
        projector.wideScreenMode();
        soundSystem.setSurroundSound(true);
        soundSystem.setVolume(10);
        dvdPlayer.turnOn();
        dvdPlayer.play();

    }

    public void stopMovie() {
        lights.turnOn();
        dvdPlayer.stop();
    }

    public void turnOff(){
        isEnable = false;
        lights.turnOn();
        projector.turnOff();
        screen.up();
        soundSystem.turnOff();
        dvdPlayer.turnOff();

    }
}
