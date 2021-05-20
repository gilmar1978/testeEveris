package br.com.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/cadastroUsuarios.feature",
		glue = "br.com.Steps",
		plugin = "pretty",
		tags = "@tela2",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		
		)

public class Runner {
	
	

}
