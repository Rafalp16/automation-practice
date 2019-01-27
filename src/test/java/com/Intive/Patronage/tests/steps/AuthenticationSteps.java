package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.pages.AuthenticationPage;
import com.Intive.Patronage.tests.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationSteps extends DriverFactory {

    AuthenticationPage authenticationPage = new AuthenticationPage(driver);

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() { authenticationPage.clickOnButton(authenticationPage.submitEmail); }

    @And("^I input unused email address$")
    public void iInputUnusedEmailAddress() { authenticationPage.inputText(authenticationPage.generateEmailAddress(), authenticationPage.emailAddress); }

}
