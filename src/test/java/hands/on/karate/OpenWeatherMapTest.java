package hands.on.karate;

import com.intuit.karate.junit5.Karate;

public class OpenWeatherMapTest {
    @Karate.Test
    Karate testOpenWeatherMap() {
        return Karate.run("classpath:hands/on/karate/current-weather.feature");
    }
}
