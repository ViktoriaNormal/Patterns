package models;

public class SurroundSoundSystem {

    private static final SurroundSoundSystem instance = new SurroundSoundSystem();
    private int volume = 0;

    public static SurroundSoundSystem getInstance() {
        return instance;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void setVolume(int volumeLevel) {
        volume = volumeLevel;
    }

    public void setStereoSound(boolean stereoSound) {

    }

    public void setSurroundSound(boolean surroundSound) {

    }
}
