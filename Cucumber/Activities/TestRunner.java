package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/Features",
                  glue = {"StepDefinitions"},
                  tags = "@TagsExample"
                )

public class TestRunner {

}
