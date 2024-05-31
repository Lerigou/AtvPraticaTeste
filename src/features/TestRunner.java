package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/componentesAv.feature", glue = "", tags = "@validar_botão_prompt")
public class TestRunner {

}
