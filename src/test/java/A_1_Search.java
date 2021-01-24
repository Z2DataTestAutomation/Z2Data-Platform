import com.shaft.gui.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class A_1_Search extends Test_Base{

    private WebDriver driver;

    @Test(description = "TS001 || Login to Z2Data Platform", priority = 1)
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }


}

