package Base;

import Pages.HomePage;
import Pages.LogInPage;
import Pages.ProfilePage;
import Pages.PracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public  WebDriver driver;
    public WebDriverWait wait;

    //Page objects
    public HomePage homePage;
    public PracticePage practicePage;
    public LogInPage logInPage;
    public ProfilePage profilePage;

    public ExcelReader excelReader;



    @BeforeClass
    public void setUp() throws IOException {

     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();

     wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     homePage= new HomePage(driver, wait);
     practicePage= new PracticePage(driver, wait);
     logInPage = new LogInPage(driver, wait);
     profilePage = new ProfilePage(driver, wait);

    excelReader = new ExcelReader ("src/test/java/TestData.xlsx");


    }

    @AfterClass
    public void tearDown(){

     driver.quit();
    }


}
