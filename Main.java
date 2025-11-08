import java.util.Scanner;

// Main class to run the weather app
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeatherService service = new WeatherService();

        System.out.println(" Welcome to Simple Weather App!");

        while (true) {
            System.out.print("\nEnter a city name (or type 'exit' to quit): ");
            String city = sc.nextLine();

            if (city.equalsIgnoreCase("exit")) {
                System.out.println(" Exiting Weather App. Stay safe!");
                break;
            }

            Weather weather = service.getWeather(city);
            weather.displayWeather();
        }

        sc.close();
    }
}
