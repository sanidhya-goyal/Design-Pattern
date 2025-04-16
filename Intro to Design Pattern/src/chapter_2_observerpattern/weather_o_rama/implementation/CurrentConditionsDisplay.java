package chapter_2_observerpattern.weather_o_rama.implementation;

import chapter_2_observerpattern.weather_o_rama.interfaces.DisplayElement;
import chapter_2_observerpattern.weather_o_rama.interfaces.Observer;
import chapter_2_observerpattern.weather_o_rama.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
