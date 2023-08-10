package co.com.WordCounter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Wordcounter.feature",
        glue = "co.com.WordCounter.stepDefinitions",
        plugin = {"rerun:target/rerunFailed/WordCounterRerun", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class WordCounter {
}
