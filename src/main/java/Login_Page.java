import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    private WebDriver driver;
    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    private String Login_UserName = "Test";
    private String Login_Password = "Test";

    public By Input_Text_Box = By.id("Username");
    public By Input_Pass = By.id("Password");
    public By SignIn_Btn = By.name("button");

    public void Z2D_SignIn() {
        driver.findElement(Input_Text_Box).sendKeys(Login_UserName);
        driver.findElement(Input_Pass).sendKeys(Login_Password);
        driver.findElement(SignIn_Btn).click();
    }
}
