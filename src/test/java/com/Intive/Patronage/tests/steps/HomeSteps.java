package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Intive.Patronage.tests.DriverFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverFactory{

    HomePage homePage = new HomePage(driver);

    @Given("^User is on automation practice home page$")
    public void userIsOnAutomationPracticeHomePage() { homePage.openHomePage(); }

    @When("^I click on contact us link$")
    public void iClickOnContactUsLink() { homePage.clickOnContactUs(); }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() { homePage.clickOnSignIn(); }

    @When("^I click on a product$")
    public void iClickOnAProduct() { homePage.clickOnProduct(); }

    @And("^I click on cart field$")
    public void iClickOnCartField() { homePage.clickOnCart(); }
}
