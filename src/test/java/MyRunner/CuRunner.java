package MyRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
        features="src/test/Features",
        glue = ".",
        tags = "@Login",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}


)
public class CuRunner {


}
