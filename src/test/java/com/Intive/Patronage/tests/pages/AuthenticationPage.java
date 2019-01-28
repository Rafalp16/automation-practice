package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    private static String AUTHENTICATION_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "email_create")
    public WebElement emailAddressCreate;

    @FindBy(how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertMessage;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public WebElement submitEmailCreate;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddressSignIn;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement passwordSignIn;

    @FindBy(how = How.XPATH, using = "/p[contains(@class,'lost_password')]/a")
    public WebElement forgotPasswordLink;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement submitLogin;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement errorField;

    public AuthenticationPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton(WebElement element) { element.click(); }

    public void isAlertDisplayed(WebElement element) { element.isDisplayed(); }

    public void inputText(String text, WebElement element) {
        element.sendKeys(text);
    }

    public String generateEmailAddress() {
        long d = System.currentTimeMillis();
        String generatedEmailAddress = d + "@xyz.com";
        return generatedEmailAddress;
    }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }
}
