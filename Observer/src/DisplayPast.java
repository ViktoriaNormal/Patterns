public class DisplayPast extends DisplayElement{
    public DisplayPast(Subject subject) {
        super(subject);
    }

    @Override
    public void display() {
        System.out.println("Раньше давление составляло " + subject.getTemperaturePast());
        System.out.println("Раньше давление составляло " + subject.getPressurePast());
        System.out.println("Раньше влажность составляла " + subject.getHumidityPast() + "\n");
    }

    @Override
    public void update() {
        display();
    }
}
