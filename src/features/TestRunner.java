package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/componentes.feature", glue = "", tags = "@validar_alteração_de_status_do_link")
public class TestRunner {

}
