public class Main {

    public static void main(String[] args) {

        DataOfWeather dataOfWeather = new DataOfWeather();

        DisplayNow displayNow = new DisplayNow(dataOfWeather);
        DisplayFuture displayFuture = new DisplayFuture(dataOfWeather);
        DisplayPast displayPast = new DisplayPast(dataOfWeather);

        dataOfWeather.notifyObservers();
    }
}