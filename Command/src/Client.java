import commands.HumidityCommand;
import commands.LightCommand;
import commands.TempCommand;
import sensors.HumiditySensor;
import sensors.LightSensor;
import sensors.Sensor;
import sensors.TempSensor;

public class Client {

    public static void main(String[] args) {

        Display display = new Display();
        Sensor humiditySensor = new HumiditySensor(45);
        Sensor lightSensor = new LightSensor(81);
        Sensor tempSensor = new TempSensor(23.4);

        display.addCommand("setHumidity", new HumidityCommand(humiditySensor));
        display.addCommand("setLight", new LightCommand(lightSensor));
        display.addCommand("setTemp", new TempCommand(tempSensor));

        display.execute("setLight", 100);

        System.out.println(lightSensor.getValue());
    }
}