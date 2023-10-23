package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage {

    WebDriver driver;
    WebDriverWait wait;

    //Elementi

    WebElement TestLoginPageLink;


    //Konstruktori

    public PracticePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    //Getteri elemenata

    public WebElement getTestLoginPageLink() {
        return driver.findElement(By.linkText("Test Login Page"));
    }


    //---------------------------------------------------------------------

    //Metode

    public void clickOnTestLoginPageLink () {

      getTestLoginPageLink().click();

    }



}
