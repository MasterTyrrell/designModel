package observer;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisPlay implements Observer,DisplayElement{

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisPlay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
        }
    }


    @Override
    public void display() {
        System.out.println("CurrentConditions:"+temperature+"F degrees and "+humidity+"% humidity");
    }
}
