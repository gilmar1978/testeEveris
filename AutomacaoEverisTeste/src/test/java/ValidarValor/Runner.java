package ValidarValor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/ValidarValor/validarValor.feature",
glue = { "" }, 
plugin = {"pretty"}, 
monochrome = true,
dryRun = false)
public class Runner {

}
