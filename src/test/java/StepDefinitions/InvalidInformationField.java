package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.FadoChangeInfo;

public class InvalidInformationField {
    FadoChangeInfo fadoChangeInfo;
    public InvalidInformationField(WebDriver driver)
    {
         fadoChangeInfo = new FadoChangeInfo(Hook.driver);
    }

    @Given("^The change information page is displayed$")
    public void the_change_information_page_is_displayed()
    {

    }

    @When("^The user leaves full name field are blank$")
    public void the_user_leaves_full_name_field_are_blank()
    {
        fadoChangeInfo.txtfullname.clear();
    }

    @Then("^in-line error message \"([^\"]*)\" should be display$")
    public void inline_error_message_something_should_be_display(String strArg1)
    {
        Assert.assertEquals("Họ và tên là bắt buộc", fadoChangeInfo.lbemptyname.getText());
    }

}
