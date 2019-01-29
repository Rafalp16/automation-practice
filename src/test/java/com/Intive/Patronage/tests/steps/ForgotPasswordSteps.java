package com.Intive.Patronage.tests.steps;

        import com.Intive.Patronage.tests.DriverFactory;
        import com.Intive.Patronage.tests.pages.ForgotPasswordPage;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Then;

public class ForgotPasswordSteps extends DriverFactory {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);


    @And("^I click on retrieve password button$")
    public void iClickOnRetrievePasswordButton() { forgotPasswordPage.retrieveButton.click(); }

    @Then("^I see a message that says that confirmation email was sent$")
    public void iSeeAMessageThatSaysThatConfirmationEmailWasSent() {
        forgotPasswordPage.confirmationField.isDisplayed();
        forgotPasswordPage.isAlertMessageCorrect("A confirmation email has been sent to your address: user999@xyz.com", forgotPasswordPage.confirmationField);
    }

    @And("^I input valid email address to retrieve account$")
    public void iInputValidEmailAddressToRetrieveAccount() { forgotPasswordPage.inputText("user999@xyz.com", forgotPasswordPage.emailAddressForgot); }

    @And("^I input invalid email address to retrieve field$")
    public void iInputInvalidEmailAddressToRetrieveField() { forgotPasswordPage.inputText("testtest", forgotPasswordPage.emailAddressForgot); }

    @And("^I input unused email address to retrieve field$")
    public void iInputUnusedEmailAddressToRetrieveField() { forgotPasswordPage.inputText("wswqsqwsqws@wp.pl", forgotPasswordPage.emailAddressForgot); }

    @Then("^I see that an error message about no account is displayed$")
    public void iSeeThatAnErrorMessageAboutNoAccountIsDisplayed() {
        forgotPasswordPage.errorField.isDisplayed();
        forgotPasswordPage.isAlertMessageCorrect("There is 1 error\nThere is no account registered for this email address.", forgotPasswordPage.errorField);
    }
}
