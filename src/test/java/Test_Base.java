import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Test_Base {
    public static WebDriver driver;

    private String Test_URL =  "https:www.google.com";
    private String Prod_URL = "Test" ;
    private String Landing_Url = "Test";


    @BeforeSuite
    public void Setup(){
        Login_Page LoginObj = new Login_Page(driver);
       WebDriverManager.chromedriver().setup();
        //driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
        driver.navigate().to(Test_URL);
        LoginObj.Z2D_SignIn();
    }

    @AfterMethod
    public void Back_To_Landing(){
        driver.navigate().to(Landing_Url);
    }

    @AfterSuite
    public void TearDown() {
        driver.quit();
    }

}
