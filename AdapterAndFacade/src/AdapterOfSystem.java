import models.HomeTheaterSystem;
import models.StreetTheaterSystem;

public class AdapterOfSystem extends HomeTheaterSystem {

    private final StreetTheaterSystem adapt;

    public AdapterOfSystem(StreetTheaterSystem adapt) {
        this.adapt = adapt;
    }

    @Override
    public void playMovie(String movieTitle) {
        adapt.playMovie(movieTitle);
    }

    @Override
    public void stopMovie() {
        adapt.stopMovie();
    }

    @Override
    public void turnOff(){
        adapt.turnOff();
    }
}
