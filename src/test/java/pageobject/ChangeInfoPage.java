package pageobject;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChangeInfoPage {

    @FindBy (xpath = "//input[@id='auth-block__form-group__email']")
    public WebElement txtusername ;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement txtpassword ;

    @FindBy (xpath = "//button[@class='my-btn -btn-pill auth-block__login-btn mz-btn-primary']")
    public WebElement btnlogin ;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement btnclose;

    @FindBy(xpath = "//span[@class='user-name-col']")
    public WebElement name;

    @FindBy (xpath = "//img[@class='user-edit-profile-icon']")
    public WebElement iconEdit;

    @FindBy (xpath = "//div[@id='close-button-1545222288830']")
    public WebElement iconclose;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@name='fullname']")
    public WebElement txtfullname;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement txtphone;

    @FindBy (xpath = "//input[@name='birthdate']")
    public WebElement birthday;

    @FindBy(xpath = "//input[@class='numInput cur-year']")
    public WebElement year;

    @FindBy(xpath = "//div[@class='flatpickr-month']//select//option[contains(text(),\"Tháng ba\")]")
    public WebElement month;

    @FindBy(xpath = "//div[@class=\"dayContainer\"]//span[contains(@class,'flatpickr-day') and text()='18']")
    public WebElement day;

    @FindBy(xpath = "//input[@name='gender'][@value='2']")
    public WebElement gender;

    @FindBy(xpath = "//button[@class='my-btn -btn-pill -btn-md -btn-grd-bg']")
    public WebElement btnconfirm;

    @FindBy (xpath = "//label[contains(text(),'Họ và tên là bắt buộc')]")
    public  WebElement lbemptyname;

    @FindBy(xpath = "//label[contains(text(),'Điện thoại là bắt buộc')]")
    public WebElement lbemptyphone;



    public ChangeInfoPage(WebDriver driver)
    {
        driver.get("https://fado.vn/dang-nhap");
        PageFactory.initElements(driver, this);

    }
}

