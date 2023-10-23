package Tests;

import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp (){

    driver.navigate().to(" https://practicetestautomation.com/");

    }


    @Test

    public void verifyThatUserCanLogIn() {


        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageLink();
        logInPage.inputUsername("student");
        logInPage.inputPassword("Password123");
        logInPage.submitButtonClick();

        //Assertions

        profilePage.isLogOutButtonDisplayed();
        profilePage.isLogInMessageDisplayed();


        //Equals String successfulMessage + username

    }

    //Lists Of Valid/Invalid Usernames,Passwords

    @Test
    public void verifyThatUserCannotLogin () {

        for (int i = 1; i < excelReader.getLastRow("Username") ; i++) {

            String invalidUsername= excelReader.getStringData("Sheet1",i, 0);
            String invalidPassword= excelReader.getStringData("Sheet1",i, 1);

        }


        homePage.clickOnPracticeButton();
        practicePage.clickOnTestLoginPageLink();
        logInPage.inputUsername("student");
        logInPage.inputPassword("Password123");
        logInPage.submitButtonClick();




    }
    //Wrong credentials
    //One valid, one invalid X2
    //One blank, one valid X
    //Both blank
    //One blank, one invalid X2




}
