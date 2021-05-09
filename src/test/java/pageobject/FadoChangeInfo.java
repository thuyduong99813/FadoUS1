package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FadoChangeInfo {

    @FindBy(xpath = "//button[@class='close']")
    public WebElement btnclose;

    @FindBy(xpath = "//span[@class='user-name-col']")
    public WebElement drwname ;

    @FindBy (xpath = "//img[@class='user-edit-profile-icon']")
    public WebElement iconupdate ;

//    @FindBy (xpath = "//div[@id='close-button-1545222288830']")
//    public WebElement btnclosenoti;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement fieldemail;

    @FindBy (xpath = "//input[@name='fullname']")
    public WebElement txtfullname;

    @FindBy (xpath = "//label[contains(text(),'Họ và tên là bắt buộc')]")
    public  WebElement lbemptyname;

    public FadoChangeInfo (WebDriver driver)
    {
        driver.get("https://fado.vn/thong-tin-ca-nhan");
        PageFactory.initElements(driver, this);
    }
}
