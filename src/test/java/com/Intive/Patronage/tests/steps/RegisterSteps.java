package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.AuthenticationPage;
import com.Intive.Patronage.tests.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Intive.Patronage.tests.DriverFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps extends DriverFactory {

    RegisterPage registerPage = new RegisterPage(driver);

    @Then("^I see that an error is displayed$")
    public void iSeeThatAnErrorIsDisplayed() { registerPage.isAlertDisplayed(registerPage.errorField); }

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

    @And("^I choose valid country$")
    public void iChooseValidCountry() { registerPage.selectValue(registerPage.country, "21"); }

    @And("^I choose invalid country$")
    public void iChooseInvalidCountry() { registerPage.selectValue(registerPage.country, ""); }

    @And("^I choose valid state$")
    public void iChooseValidState() { registerPage.selectValue(registerPage.state, "1"); }

    @And("^I input valid postal code$")
    public void iInputValidPostalCode() { registerPage.inputText("00000", registerPage.postalCode); }

    @And("^I input valid mobile phone$")
    public void iInputValidMobilePhone() { registerPage.inputText("000000000", registerPage.phoneMobile); }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() { registerPage.clickOnButton(registerPage.submitAccount); }

    @Then("^I am redirected to my account page$")
    public void iAmRedirectedToMyAccountPage() { registerPage.iAmOnMyAccountPage(); }

    @Then("^I check if the error message says that firstname is required$")
    public void iCheckIfTheErrorMessageSaysThatFirstnameIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\nfirstname is required.", registerPage.errorField);
    }

    @Then("^I check if the error message says that lastname is required$")
    public void iCheckIfTheErrorMessageSaysThatLastnameIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\nlastname is required.", registerPage.errorField);
    }

    @Then("^I check if the error message says that password is required$")
    public void iCheckIfTheErrorMessageSaysThatPasswordIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\npasswd is required.", registerPage.errorField);
    }

    @Then("^I check if the error message says that address is required$")
    public void iCheckIfTheErrorMessageSaysThatAddressIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\naddress1 is required.", registerPage.errorField);
    }

    @Then("^I check if the error message says that city is required$")
    public void iCheckIfTheErrorMessageSaysThatCityIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\ncity is required.", registerPage.errorField);
    }

    @Then("^I check if the error message says that country is required$")
    public void iCheckIfTheErrorMessageSaysThatCountryIsRequired() { registerPage.isAlertMessageCorrect("There are 3 errors\n" +
            "id_country is required.\n" +
            "Country cannot be loaded with address->id_country\n" +
            "Country is invalid", registerPage.errorField);
    }

    @Then("^I check if the error message says that state is required$")
    public void iCheckIfTheErrorMessageSaysThatStateIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\nThis country requires you to choose a State.", registerPage.errorField);
    }


    @Then("^I check if the error message says that postal code must follow specific format$")
    public void iCheckIfTheErrorMessageSaysThatPostalCodeMustFollowSpecificFormat() { registerPage.isAlertMessageCorrect("There is 1 error\nThe Zip/Postal code you've entered is invalid. It must follow this format: 00000", registerPage.errorField);
    }

    @Then("^I check if the error message says that at least one phone number is required$")
    public void iCheckIfTheErrorMessageSaysThatAtleastOnePhoneNumberIsRequired() { registerPage.isAlertMessageCorrect("There is 1 error\nYou must register at least one phone number.", registerPage.errorField);
    }

    @Then("^I check if the error message displays all errors$")
    public void iCheckIfTheErrorMessageDisplaysAllErrors() { registerPage.isAlertMessageCorrect("There are 8 errors\n" +
            "You must register at least one phone number.\n" +
            "lastname is required.\n" +
            "firstname is required.\n" +
            "passwd is required.\n" +
            "address1 is required.\n" +
            "city is required.\n" +
            "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\n" +
            "This country requires you to choose a State.", registerPage.errorField); }
}