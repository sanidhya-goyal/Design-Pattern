- The weather station will be based on our patent pending
  WeatherData object, which tracks current weather conditions
  -  temperature
  - humidity
  - barometric pressure
- Create an application that initially provides three
  display elements: 
  - current conditions
  - weather statistics 
  - simple forecast
- Weather-O-Rama wants to release an API so that other developers can
  write their own weather displays and plug them right in.

### The Weather Monitoring application overview
The three players in the system are: 
- **Weather station** (the physical device that
acquires the actual weather data)
- **WeatherData object** (that tracks the data coming
from the Weather Station and updates the displays) 
- the **display** that shows users
the current weather conditions.

![WeatherORama.png](../../resources/chapter_2_observerpattern/WeatherORama.png)

- The WeatherData object knows how to talk to the physical Weather Station, to get
updated data. 
- The WeatherData object then updates its displays for the three different
display elements: 
  - Current Conditions (shows temperature, humidity, and pressure), 
  - Weather Statistics
  - Simple forecast

------------------------------------------------------------------------------------------------------------

- WeatherData class is the “one” and our “many” is the various display elements that use the weather
measurements.
- When those measurements change, we have to notify all the display elements
- Weather Station knows about a display element, then it can
  just call a method to tell it about the measurements.
- Every display element can be different, so I think that’s
  where having a common interface comes in. Even though every component has a
  different type, they should all implement the same interface so that the WeatherData
  object will know how to send them the measurements.
- Every display will have an update() method that WeatherData will call and 
update() is defined in a common interface that all the elements implement


![Designing the Weather Station.png](../../resources/chapter_2_observerpattern/Designing%20the%20Weather%20Station.png)