package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageobject.FadoChangeInfo;

public class DisableEmail {
    FadoChangeInfo fadoChangeInfo;
    public DisableEmail ()
    {
        fadoChangeInfo = new FadoChangeInfo(Hook.driver);
    }

    @Given("^The account information page is showed$")
    public void the_account_information_page_is_showed()
    {
        //fadoChangeInfo.btnclosenoti.click();
    }

    @When("^ The user tried to change the email address$")
    public void the_user_tried_to_change_the_email_address()
    {
        fadoChangeInfo.fieldemail.isEnabled();
    }

    @Then("^ Email field is disabled $")
    public void email_field_is_disabled()
    {

    }



}
