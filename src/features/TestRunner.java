package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/componentes.feature", glue = "", tags = "@validar_radio_checkbox")
public class TestRunner {

}
