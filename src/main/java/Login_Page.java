import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login_Page {
    private final WebDriver driver;
    public String URL_for_Navigation = "https://app1.z2data.com";

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void Navigate_To_URL_for_Navigation() {
        driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
        driver.navigate().to(URL_for_Navigation);
    }
    private String Login_UserName = "Test";
    private String Login_Password = "Test";

    public By UserName = By.xpath("//input[@id='Username']");
    //By.id("Username");
    public By Password = By.xpath("//input[@id='Password']");
    // By.id("Password");
    public By SignIn_Btn = By.xpath("//button[normalize-space()='Sign in']");
    //By.name("button");

    public void Z2D_SignIn() {
        driver.findElement(UserName).sendKeys("Z2D.PR1@z2data.com");
        driver.findElement(Password).sendKeys("Z2D.PR1@z2data.com");
        driver.findElement(SignIn_Btn).click();
        WebDriverWait WebWait = new WebDriverWait(driver, 90);
    }
}
