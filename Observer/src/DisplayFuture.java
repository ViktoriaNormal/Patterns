public class DisplayFuture extends DisplayElement{

    public DisplayFuture(Subject subject) {
        super(subject);
    }

    @Override
    public void display() {
        System.out.println("Температура будет составлять " + subject.getTemperatureFuture());
        System.out.println("Давление будет составлять " + subject.getPressureFuture());
        System.out.println("Влажность будет составлять  " + subject.getHumidityFuture() + "\n");
    }

    @Override
    public void update() {
        display();
    }
}
