package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Intive.Patronage.tests.DriverFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps extends DriverFactory {

    RegisterPage registerPage = new RegisterPage(driver);

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() { registerPage.clickOnButton(registerPage.submitEmail); }

    @Then("^I see that an error is displayed$")
    public void iSeeThatAnErrorIsDisplayed() { registerPage.isAlertDisplayed(registerPage.errorField); }

    @And("^I input unused email address$")
    public void iInputUnusedEmailAddress() { registerPage.inputText(registerPage.generateEmailAddress(), registerPage.emailAddress); }

    @And("^I input valid first name$")
    public void iInputValidFirstName() { registerPage.inputText("tmp", registerPage.firstName); }

    @And("^I input valid last name$")
    public void iInputValidLastName() { registerPage.inputText("tmp", registerPage.lastName); }

    @And("^I input valid password$")
    public void iInputValidPassword() { registerPage.inputText("password", registerPage.password); }

    @And("^I input valid address$")
    public void iInputValidAddress() { registerPage.inputText("tmp", registerPage.address); }

    @And("^I input valid city$")
    public void iInputValidCity() { registerPage.inputText("tmp", registerPage.city); }

    @And("^I input valid country$")
    public void iInputValidCountry() { registerPage.selectValue(registerPage.country, "21"); }

    @And("^I input valid state$")
    public void iInputValidState() { registerPage.selectValue(registerPage.state, "1"); }

    @And("^I input valid postal code$")
    public void iInputValidPostalCode() { registerPage.inputText("00000", registerPage.postalCode); }

    @And("^I input valid mobile phone$")
    public void iInputValidMobilePhone() { registerPage.inputText("000000000", registerPage.phoneMobile); }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() { registerPage.clickOnButton(registerPage.submitAccount); }

    @Then("^I am redirected to my account page$")
    public void iAmRedirectedToMyAccountPage() { registerPage.iAmOnMyAccountPage(); }
}
