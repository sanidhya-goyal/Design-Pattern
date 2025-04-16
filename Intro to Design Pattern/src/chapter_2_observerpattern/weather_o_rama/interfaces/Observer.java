package chapter_2_observerpattern.weather_o_rama.interfaces;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
