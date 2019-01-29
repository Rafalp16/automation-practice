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
    public void iClickOnCreateAnAccountButton() {
        authenticationPage.clickOnButton(authenticationPage.submitEmailCreate);
    }

    @And("^I input unused email address$")
    public void iInputUnusedEmailAddress() {
        authenticationPage.inputText(authenticationPage.generateEmailAddress(), authenticationPage.emailAddressCreate);
    }

    @And("^I input invalid email address$")
    public void iInputInvalidEmailAddress() {
        authenticationPage.inputText("test", authenticationPage.emailAddressCreate);
    }

    @And("^I input used email address$")
    public void iInputUsedEmailAddress() {
        authenticationPage.inputText("test123@zyx.com", authenticationPage.emailAddressCreate);
    }

    @Then("^I see that an error message about existing account is displayed$")
    public void iSeeThatAnErrorMessageAboutExistingAccountIsDisplayed() {
        authenticationPage.isAlertMessageCorrect("An account using this email address has already been registered. Please enter a valid password or request a new one.", authenticationPage.alertMessage);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        authenticationPage.clickOnButton(authenticationPage.submitLogin);
    }

    @Then("^I see that an error message about required email is displayed$")
    public void iSeeThatAnErrorMessageAboutRequiredEmailIsDisplayed() {
        authenticationPage.errorField.isDisplayed();
        authenticationPage.isAlertMessageCorrect("There is 1 error\nAn email address required.", authenticationPage.errorField);
    }

    @Then("^I see that an error message about required password is displayed$")
    public void iSeeThatAnErrorMessageAboutRequiredPasswordIsDisplayed() {
        authenticationPage.errorField.isDisplayed();
        authenticationPage.isAlertMessageCorrect("There is 1 error\nPassword is required.", authenticationPage.errorField);
    }

    @And("^I input invalid email address to sign in field$")
    public void iInputInvalidEmailAddressToSignInField() {
        authenticationPage.inputText("test", authenticationPage.emailAddressSignIn); }

    @And("^I input valid email address to sign in field$")
    public void iInputValidEmailAddressToSignInField() { authenticationPage.inputText("user123@xyz.com", authenticationPage.emailAddressSignIn); }

    @And("^I input valid password to sign in field$")
    public void iInputValidPasswordToSignInField() { authenticationPage.inputText("password123", authenticationPage.passwordSignIn); }

    @And("^I click on forgot your password link$")
    public void iClickOnForgotYourPasswordLink() { authenticationPage.forgotPasswordLink.click(); }
}