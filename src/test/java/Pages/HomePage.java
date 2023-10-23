package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    //Elementi
    WebElement practiceButton;



    //Konstruktori

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    //Getteri elemenata

    public WebElement getPracticeButton() {
        return driver.findElement(By.id("menu-item-20"));
    }


    //---------------------------------------------------------------------

    //Metode

    public void clickOnPracticeButton () {

    getPracticeButton().click();

    }

}
