package chapter_2_observerpattern.weather_o_rama;

import chapter_2_observerpattern.weather_o_rama.implementation.CurrentConditionsDisplay;
import chapter_2_observerpattern.weather_o_rama.implementation.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
