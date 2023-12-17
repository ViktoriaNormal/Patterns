package commands;

import sensors.Sensor;

public class HumidityCommand implements Command {

    private final Sensor sensor;

    public HumidityCommand(Sensor sensor) {
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
