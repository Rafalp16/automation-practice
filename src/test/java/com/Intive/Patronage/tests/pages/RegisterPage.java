package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterPage {

    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement errorField;

    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement firstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement lastName;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement password;

    @FindBy(how = How.ID, using = "address1")
    public WebElement address;

    @FindBy(how = How.ID, using = "city")
    public WebElement city;

    @FindBy(how = How.ID, using = "id_country")
    public WebElement country;

    @FindBy(how = How.ID, using = "id_state")
    public WebElement state;

    @FindBy(how = How.ID, using = "postcode")
    public WebElement postalCode;

    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement submitAccount;

    public RegisterPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton(WebElement element) { element.click(); }

    public void isAlertDisplayed(WebElement element) { element.isDisplayed(); }

    public void inputText(String text, WebElement element) {
        element.sendKeys(text);
    }

    public void selectValue(WebElement element, String value) {
        Select dropdown = new Select(element);
        dropdown.selectByValue(value);
    }

    public void iAmOnMyAccountPage()  {
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on my account page", actualURL.equals("http://automationpractice.com/index.php?controller=my-account"));
    }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }
}