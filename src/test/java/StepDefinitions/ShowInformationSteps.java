package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.ChangeInfoPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShowInformationSteps {
    WebDriver driver;
    ChangeInfoPage changeInfoPage;
    public ShowInformationSteps()
    {
        Hooks.driver = Hooks.driver;
        changeInfoPage = new ChangeInfoPage(Hooks.driver);
    }

    @Given("^The user already login to Fado website with account \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_already_login_to_fado_website_with_account_something_and_password_something(String username, String password)
    {
        changeInfoPage.txtusername.sendKeys("thuyduong99813@gmail.com");
        changeInfoPage.txtpassword.sendKeys("thuyduong998");
        changeInfoPage.btnlogin.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        changeInfoPage.btnclose.click();
    }

    @Given("^The update user information form is showed$")
    public void the_update_user_information_form_is_showed()
    {
        changeInfoPage.name.click();
        changeInfoPage.iconEdit.click();
    }

    @When("^The user try to show the Calendar popup for new value for birthday. \"([^\"]*)\" for example$")
    public void the_user_try_to_show_the_calendar_popup_for_new_value_for_birthday_something_for_example(String strArg1)
    {
        changeInfoPage.birthday.click();
        changeInfoPage.year.sendKeys("2000");
        changeInfoPage.month.click();
        changeInfoPage.day.click();
    }

    @When("^The user attempt to clear value of Fullname and Phone $")
    public void the_user_attempt_to_clear_value_of_fullname_and_phone()
    {
        changeInfoPage.txtfullname.clear();
        changeInfoPage.txtphone.clear();
        changeInfoPage.btnconfirm.click();

    }

    @When("^The user attempt to update with all valid values$")
    public void the_user_attempt_to_update_with_all_valid_values()
    {
        changeInfoPage.txtfullname.clear();
        changeInfoPage.txtfullname.sendKeys("Thùy Dương");
        changeInfoPage.txtphone.clear();
        changeInfoPage.txtphone.sendKeys("0967112924");
        changeInfoPage.btnconfirm.click();
    }

    @When("^The user attempt to clear all values$")
    public void the_user_attempt_to_clear_all_values()
    {
        changeInfoPage.txtfullname.clear();
        changeInfoPage.txtphone.clear();
        changeInfoPage.birthday.clear();
        changeInfoPage.btnconfirm.click();
    }

    @Then("^The current user information is showed for default$")
    public void the_current_user_information_is_showed_for_default()
    {
        assertThat(changeInfoPage.txtfullname.getAttribute("value"), is("Thùy Dương"));
        assertThat(changeInfoPage.txtphone.getAttribute("value"), is("0967112924"));
        assertThat(changeInfoPage.email.getAttribute("value"), is("thuyduong99813@gmail.com"));
        assertThat(changeInfoPage.birthday.getAttribute("value"), is("18-03-2000"));
        changeInfoPage.gender.isSelected();
    }

    @Then("^The value of date of birth will be updated to \"([^\"]*)\" $")
    public void the_value_of_date_of_birth_will_be_updated_to_something(String strArg1)
    {
        assertThat(changeInfoPage.birthday.getAttribute("value"), is("18-03-2000"));
    }

    @Then("^The message \"([^\"]*)\" will be displayed below Fullname field$")
    public void the_message_something_will_be_displayed_below_fullname_field(String strArg1)
    {
        assertThat(changeInfoPage.txtfullname.getAttribute("value"), is("Họ và tên là bắt buộc"));
    }

    @Then("^The message \"([^\"]*)\" will be showed$")
    public void the_message_something_will_be_showed(String strArg1)
    {
        assertThat(changeInfoPage.txtfullname.getAttribute("value"),is("Quý khách đã cập nhập thông tin tài khoản thành công !"));
    }

    @Then("^The user should see blank value for all except email field$")
    public void the_user_should_see_blank_value_for_all_except_email_field()
    {
        assertThat(changeInfoPage.txtfullname.getAttribute("value"),is(""));
        assertThat(changeInfoPage.txtphone.getAttribute("value"),is(""));
        assertThat(changeInfoPage.email.getAttribute("value"),is("thuyduong99813@gmail.com"));
        assertThat(changeInfoPage.birthday.getAttribute("value"), is(""));
    }

    @And("^The email information can't be updated$")
    public void the_email_information_cant_be_updated()
    {

    }



    @And("^The date of birth is display as \"([^\"]*)\" format$")
    public void the_date_of_birth_is_display_as_something_format(String strArg1)
    {

    }


    @And("^The message \"([^\"]*)\" will be displayed below phone number$")
    public void the_message_something_will_be_displayed_below_phone_number(String strArg1)
    {
        assertThat(changeInfoPage.txtfullname.getAttribute("value"), is("Điện thoại là bắt buộc"));
    }

    @And("^The email field value is \"([^\"]*)\"$")
    public void the_email_field_value_is_something(String strArg1)
    {
        assertThat(changeInfoPage.email.getAttribute("value"),is("thuyduong99813@gmail.com"));
    }

}

