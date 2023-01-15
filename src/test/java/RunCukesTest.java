
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "phonebook.steps",
        tags = "@add_new_contact"

)

public class RunCukesTest {

}