package StepDefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    public static WebDriver driver;
    @Before
    public void opendriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void ShowInfo(ShowChangeInfoPageStepDef showChangeInfoPageStepDef)
    {

    }

    @Test
    public void Disable(DisableEmail disableEmail)
    {

    }

    @Test
    public void Invalid(InvalidInformationField invalidInformationField)
    {

    }
}
