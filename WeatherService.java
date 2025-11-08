// Class to provide weather data (mock version)
public class WeatherService {

    // Returns fake data for demo purposes
    public Weather getWeather(String city) {
        city = city.trim().toLowerCase();

        switch (city) {
            case "delhi":
                return new Weather("Delhi", 30.5, "Sunny", 45, 10.2);
            case "mumbai":
                return new Weather("Mumbai", 28.0, "Humid", 80, 12.5);
            case "bangalore":
                return new Weather("Bangalore", 25.5, "Cloudy", 60, 9.0);
            case "chennai":
                return new Weather("Chennai", 32.0, "Hot", 50, 11.3);
            default:
                return new Weather(city.substring(0, 1).toUpperCase() + city.substring(1),
                        27.0, "Data not available (Mock)", 50, 8.0);
        }
    }
}
