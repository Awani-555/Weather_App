#  Simple Weather App (Java)

A beginner-friendly Java console app that shows mock weather data for different cities.  
Demonstrates **Object-Oriented Programming** and can be extended with real APIs later.

---

## Features
- Enter city name and get weather details  
- Displays temperature, humidity, condition, and wind speed  
- Easy to extend with real APIs (like OpenWeatherMap)

---

##  Concepts Used
- **Classes and Objects**  
- **Methods and Constructors**  
- **Switch-case**  
- **User input using Scanner**

---

## Project Structure
WeatherApp-Java/
├── Main.java
├── Weather.java
├── WeatherService.java
└── README.md

## Developer Insights

>  *These notes show the thinking behind the implementation.*

1. **Design Simplicity Over Complexity**  
   The code focuses on clarity and readability over unnecessary abstraction.  
   Each class handles only one responsibility — easy for anyone to follow or modify.

2. **Mock Data, Real Architecture**  
   Even though data is mock, the architecture mirrors a real-world weather system (data layer → service layer → main UI).  
   This makes API integration seamless in the future.

3. **Scalability in Mind**  
   New cities or APIs can be added by just modifying one file (`WeatherService.java`) — no changes to other classes needed.

4. **Upgrade Path**  
   - Replace mock switch cases with live API calls (using `HttpURLConnection` or libraries like `OkHttp`).  
   - Add caching for repeated city lookups.  
   - Convert to GUI app using JavaFX or a web-based React + Spring Boot version.

5. **Focus on Learning Outcomes**  
   This project helps strengthen understanding of OOP, modular design, and separation of concerns — foundational for backend development.


