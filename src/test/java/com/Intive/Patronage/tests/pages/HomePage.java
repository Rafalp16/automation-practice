package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private static String HOMEPAGE_URL = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "contact-link")
    private WebElement contactUsLink;

    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement sendButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement errorField;

    @FindBy(how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertMessage;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddress;

    @FindBy(how = How.ID, using = "message")
    public WebElement message;

    @FindBy(how = How.ID, using = "id_contact")
    public WebElement subject;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    public WebElement successField;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() { driver.get(HOMEPAGE_URL); }

    public void clickOnContactUs() { contactUsLink.click(); }

    public void clickOnSend() { sendButton.click(); }

    public void isAlertDisplayed(WebElement element) { element.isDisplayed(); }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }

    public void inputText(String text, WebElement element) {
        element.sendKeys(text);
    }

    public void selectValue(WebElement element) {
        element.click();
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.RETURN);
    }
}
