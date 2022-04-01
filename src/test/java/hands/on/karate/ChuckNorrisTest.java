package hands.on.karate;

import com.intuit.karate.junit5.Karate;

public class ChuckNorrisTest {
    @Karate.Test
    Karate testChuckNorris() {
        return Karate.run("classpath:hands/on/karate/random-jokes.feature");
    }
}
