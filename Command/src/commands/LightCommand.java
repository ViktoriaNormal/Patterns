package commands;

import sensors.Sensor;

public class LightCommand implements Command {

    private final Sensor sensor;

    public LightCommand(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public boolean execute(String... args) {
        if(args.length !=0 && args[0].matches("^[0-9]*[.]?[0-9]+$")) {
            sensor.setValue(Double.parseDouble(args[0]));
            return true;
        }
        return false;
    }
}
