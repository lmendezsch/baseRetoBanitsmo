package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.RunnerPersonalizado;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/EscenarioBanitsmo.feature"},
        tags = "@FlujoEscenario",
        glue = "stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class EscenarioBanitsmoRunner {
}
