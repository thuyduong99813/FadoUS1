package secondcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src\\test\\resources\\secondcucumber1\\ShowInfomation.feature", glue = "StepDefinitions")
public class RunCucumberTest {

}
