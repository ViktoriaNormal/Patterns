public class DisplayNow extends DisplayElement{

    public DisplayNow(Subject subject) {
        super(subject);
    }

    @Override
    public void display() {
        System.out.println("На данный момент температура составляет " + subject.getTemperatureNow());
        System.out.println("На данный момент давление составляет " + subject.getPressureNow());
        System.out.println("На данный момент влажность составляет " + subject.getHumidityNow() + "\n");
    }

    @Override
    public void update() {
        display();
    }
}
