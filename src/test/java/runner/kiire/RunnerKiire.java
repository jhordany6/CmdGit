package runner.kiire;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Kiire/kiire.feature",
        glue = "stepdefinition.kiire",
        tags = "@Registro"
)

public class RunnerKiire {


}
