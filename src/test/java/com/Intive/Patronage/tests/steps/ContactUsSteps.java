package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import com.Intive.Patronage.tests.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {

    ContactUsPage contactUsPage = new ContactUsPage(driver);

    @And("^I click on send button$")
    public void iClickOnSendButton() { contactUsPage.clickOnSend(); }

    @Then("^I see that an error pop-up is displayed$")
    public void iSeeThatAnErrorIsDisplayed() { contactUsPage.isAlertDisplayed(contactUsPage.errorField); }

    @Then("^I see that an error message about invalid email is displayed$")
    public void iSeeThatAnErrorMessageAboutInvalidEmailIsCorrect() {
        contactUsPage.isAlertMessageCorrect("Invalid email address.", contactUsPage.alertMessage);
    }

    @Then("^I see that an error message about blank message is displayed$")
    public void iSeeThatAnErrorMessageAboutBlankMessageIsDisplayed() {
        contactUsPage.isAlertMessageCorrect("The message cannot be blank.", contactUsPage.alertMessage);
    }

    @And("^I input valid email address$")
    public void iInputValidEmailAddress() { contactUsPage.inputText("test@xyz.com", contactUsPage.emailAddress); }

    @And("^I input valid message$")
    public void iInputValidMessage() { contactUsPage.inputText("Test message", contactUsPage.message); }

    @Then("^I see that an error message about no subject picked is displayed$")
    public void iSeeThatAnErrorMessageAboutNoSubjectPickedIsDisplayed() {
        contactUsPage.isAlertMessageCorrect("Please select a subject from the list provided.", contactUsPage.alertMessage);
    }

    @And("^I choose valid subject$")
    public void iChooseValidSubject() { contactUsPage.selectValue(contactUsPage.subject, "2") ;}

    @Then("^I see that message was sent and receive an success alert$")
    public void iSeeThatMessageWasSentAndReceiveAnConfirmationMessage() {
        contactUsPage.isAlertDisplayed(contactUsPage.successField);
        contactUsPage.isAlertMessageCorrect("Your message has been successfully sent to our team.", contactUsPage.successField);
    }
}
