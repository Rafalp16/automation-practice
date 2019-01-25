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
    public void iSeeThatAnErrorIsDisplayed() { homePage.isAlertDisplayed(homePage.errorField); }

    @Then("^I see that an error message about invalid email is displayed$")
    public void iSeeThatAnErrorMessageAboutInvalidEmailIsCorrect() {
        homePage.isAlertMessageCorrect("Invalid email address.", homePage.alertMessage);
    }

    @Then("^I see that an error message about blank message is displayed$")
    public void iSeeThatAnErrorMessageAboutBlankMessageIsDisplayed() {
        homePage.isAlertMessageCorrect("The message cannot be blank.", homePage.alertMessage);
    }

    @And("^I input valid email address$")
    public void iInputValidEmailAddress() { homePage.inputText("test@xyz.com", homePage.emailAddress); }

    @And("^I input valid message$")
    public void iInputValidMessage() { homePage.inputText("Test message", homePage.message); }

    @Then("^I see that an error message about no subject picked is displayed$")
    public void iSeeThatAnErrorMessageAboutNoSubjectPickedIsDisplayed() {
        homePage.isAlertMessageCorrect("Please select a subject from the list provided.", homePage.alertMessage);
    }

    @And("^I choose valid subject$")
    public void iChooseValidSubject() { homePage.selectValue(homePage.subject) ;}

    @Then("^I see that message was sent and receive an success alert$")
    public void iSeeThatMessageWasSentAndReceiveAnConfirmationMessage() {
        homePage.isAlertDisplayed(homePage.successField);
        homePage.isAlertMessageCorrect("Your message has been successfully sent to our team.", homePage.successField);
    }
}
