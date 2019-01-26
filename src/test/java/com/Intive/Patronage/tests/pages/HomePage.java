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

    @FindBy(how = How.CLASS_NAME, using = "header_user_info")
    private WebElement signInButton;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() { driver.get(HOMEPAGE_URL); }

    public void clickOnContactUs() { contactUsLink.click(); }

    public void clickOnSignIn() { signInButton.click(); }
}
