package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageobject.FadoChangeInfo;
import pageobject.FadoLoginPage;

public class ShowChangeInfoPageStepDef {

    FadoLoginPage fadoLoginPage;
    FadoChangeInfo fadoChangeInfo;
    public ShowChangeInfoPageStepDef()
    {
        fadoLoginPage = new FadoLoginPage(Hook.driver);
        fadoChangeInfo = new FadoChangeInfo(Hook.driver);
    }

    @Given("^The user already login on website with username is \"([^\"]*)\" and password is \"([^\"]*)\"$")
    public void the_user_already_login_on_website_with_username_is_something_and_password_is_something(String txtusername, String txtpassword)
    {
        Hook.driver.findElement(By.xpath("//input[@id='auth-block__form-group__email']")).sendKeys("thuyduong99813@gmail.com");
        Hook.driver.findElement(By.xpath("//input[@type='password']")).sendKeys("thuyduong998");
        fadoLoginPage.btnlogin.click();
    }

    @Given("^The homepage is showed$")
    public void the_homepage_is_showed()
    {
        fadoChangeInfo.btnclose.click();
    }

    @When("^When the user open Account information function to change some info$")
    public void when_the_user_open_account_information_function_to_change_some_info()
    {
        fadoChangeInfo.drwname.click();
        fadoChangeInfo.iconupdate.click();
    }

    @Then("^The default info will be fill out to update form$")
    public void the_default_info_will_be_fill_out_to_update_form()
    {
        //Hook.driver.switchTo().alert().accept();
    }

}

