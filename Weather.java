// Class to represent weather information for a city
public class Weather {
    private String city;
    private double temperature;
    private String condition;
    private int humidity;
    private double windSpeed;

    // Constructor
    public Weather(String city, double temperature, String condition, int humidity, double windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    // Displays weather details
    public void displayWeather() {
        System.out.println("\n Weather Report for " + city);
       
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Condition: " + condition);
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
    }
}
