package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {

    HomePage homePage = new HomePage(driver);

    @Given("^User is on automation practice home page$")
    public void userIsOnAutomationPracticeHomePage() { homePage.openHomePage(); }

    @When("^I click on contact us link$")
    public void iClickOnContactUsLink() { homePage.clickOnContactUs(); }

    @And("^I click on send button$")
    public void iClickOnSendButton() { homePage.clickOnSend(); }

    @Then("^I see that an error is displayed$")
    public void iSeeThatAnErrorIsDisplayed() { homePage.isErrorDisplayed(); }
}
