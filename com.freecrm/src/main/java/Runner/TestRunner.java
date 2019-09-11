package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Paths/cucumber and selenium/com.freecrm/src/main/java/features/login.feature",
glue={"stepsDefinitions"}
)
public class TestRunner {

}
