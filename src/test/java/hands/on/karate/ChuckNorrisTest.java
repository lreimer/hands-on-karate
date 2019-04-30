package hands.on.karate;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:hands/on/karate/random-jokes.feature")
public class ChuckNorrisTest {
    @BeforeClass
    public static void before() {
    }
}
