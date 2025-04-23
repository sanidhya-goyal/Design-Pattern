package chapter_2_observerpattern.javabuiltin;

import chapter_2_observerpattern.weather_o_rama.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Weather Forcast : Last Pressure " + lastPressure + " and  Current Pressure " + currentPressure );
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
