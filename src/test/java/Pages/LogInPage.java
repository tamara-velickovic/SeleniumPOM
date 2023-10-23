package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {

    WebDriver driver;
    WebDriverWait wait;

    //Elementi

    WebElement userNameField;
    WebElement passwordField;
    WebElement submitButton;

    //falio mi je error

    //Konstruktori

    public LogInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    //Getteri elemenata

    public WebElement getUserNameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }


    //---------------------------------------------------------------------

    //Metode

    public void inputUsername (String username) {

     if (userNameField != null) {
     userNameField.clear();}
     getUserNameField().sendKeys(username);


    }

    public void inputPassword (String password) {

        if (passwordField != null) {
            passwordField.clear();}
        getPasswordField().sendKeys(password);

    }


    public void submitButtonClick() {

    getSubmitButton().click();


    }
}
