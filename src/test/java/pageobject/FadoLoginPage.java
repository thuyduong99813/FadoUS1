package pageobject;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FadoLoginPage {

    @FindBy (xpath = "//input[@id='auth-block__form-group__email']")
    public String txtusername ;

    @FindBy (xpath = "//input[@type='password']")
    public String txtpassword ;

    @FindBy (xpath = "//button[@class='my-btn -btn-pill auth-block__login-btn mz-btn-primary']")
    public WebElement btnlogin ;

    public FadoLoginPage (WebDriver driver)
    {
        driver.get("https://fado.vn/dang-nhap");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
}

