import models.HomeTheaterSystem;
import models.StreetTheaterSystem;

public class Client {

    public static void main(String[] args) {

        HomeTheaterSystem theaterSystem = new HomeTheaterSystem();
        theaterSystem.turnOn();
        theaterSystem.playMovie("Divergent");
        theaterSystem.turnOff();

        theaterSystem = new AdapterOfSystem(new StreetTheaterSystem());
        theaterSystem.playMovie("Divergent");
    }
}