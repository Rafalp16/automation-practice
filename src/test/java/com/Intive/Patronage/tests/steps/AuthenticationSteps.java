package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.pages.AuthenticationPage;
import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class
AuthenticationSteps extends DriverFactory {

    AuthenticationPage authenticationPage = new AuthenticationPage(driver);

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() { authenticationPage.clickOnButton(authenticationPage.submitEmailCreate); }

    @And("^I input unused email address$")
    public void iInputUnusedEmailAddress() { authenticationPage.inputText(authenticationPage.generateEmailAddress(), authenticationPage.emailAddressCreate); }

    @And("^I input invalid email address$")
    public void iInputInvalidEmailAddress() { authenticationPage.inputText("test", authenticationPage.emailAddressCreate); }

    @And("^I input used email address$")
    public void iInputUsedEmailAddress() { authenticationPage.inputText("test123@zyx.com", authenticationPage.emailAddressCreate);
    }

    @Then("^I see that an error message about existing account is displayed$")
    public void iSeeThatAnErrorMessageAboutExistingAccountIsDisplayed() { authenticationPage.isAlertMessageCorrect("An account using this email address has already been registered. Please enter a valid password or request a new one.", authenticationPage.alertMessage);
    }
}
