package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {

    WebDriver driver;
    WebDriverWait wait;

    //Elementi

    WebElement LogInMessage;
    WebElement logOutButton;

    //Konstruktori

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    //Getteri elemenata

    public WebElement getLogInMessage() {
        return driver.findElement(By.className("has-text-align-center"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.linkText("Log out"));
    }


    //---------------------------------------------------------------------

    //Metode

    public String LogInMessageText(){

    return getLogInMessage().getText();

    }

    public void clickOnlogOutButton(){

     getLogOutButton().click();

    }

    public void isLogOutButtonDisplayed() {

     Assert.assertTrue(getLogOutButton().isDisplayed());

    }

    public void isLogInMessageDisplayed() {

        Assert.assertTrue(getLogInMessage().isDisplayed());

    }

}
