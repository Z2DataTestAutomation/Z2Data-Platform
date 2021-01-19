import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login_Page {
    private final WebDriver driver;
    public String URL_for_Navigation = "https://app1.z2data.com";

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public JavascriptExecutor jse;

    public void Navigate_To_URL_for_Navigation() {
        driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
        driver.navigate().to(URL_for_Navigation);
        //BrowserActions.navigateToURL(driver,URL_for_Navigation);
    }
    public void Tear_Down() {
        BrowserActions.closeCurrentWindow(driver);
    }

    public By Input_Text_Box = By.id("Username");
    public By Input_Pass = By.id("Password");
    public By SignIn_Btn = By.name("button");

    public void Z2D_SignIn() {
        driver.findElement(Input_Text_Box).sendKeys("Z2D.PR1@z2data.com");
        driver.findElement(Input_Pass).sendKeys("Z2D.PR1@z2data.com");
        driver.findElement(SignIn_Btn).click();
        //ElementActions.type(driver, Input_Text_Box, "Z2D.PR1@z2data.com");
        //ElementActions.type(driver, Input_Pass, "Z2D.PR1@z2data.com");
        //ElementActions.click(driver, SignIn_Btn);
        WebDriverWait WebWait = new WebDriverWait(driver, 90);
        //WebWait.until(ExpectedConditions.titleIs("Part Risk | Z2DATA"));

    }
}
