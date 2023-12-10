public abstract class DisplayElement implements Observer{

    protected DataOfWeather subject;

    public DisplayElement(Subject subject){
        this.subject = (DataOfWeather) subject;
        subject.addObserver(this);
    }

    void display(){

    }
}
