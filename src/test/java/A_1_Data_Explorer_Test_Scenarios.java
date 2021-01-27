import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class A_1_Data_Explorer_Test_Scenarios {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void initialize_Global_Objects_and_Navigate() {
        driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Navigate_To_URL_for_Navigation();
    }

    @AfterClass(alwaysRun = true)
    public void TearDown() {
        BrowserActions.closeCurrentWindow(driver);
    }

    @Test(description = "TS001 || Login to Z2Data Platform", priority = 1)
    public void Login() {
        Login_Page Login_Obj = new Login_Page(driver);
        Login_Obj.Z2D_SignIn();
    }
    @Test(description = "TS002 || Open Sandbox from Data Explorer", priority = 2)
    public void Data_Explorer_Sanbox() {
        Data_Explorer_Page Data_Explorer_Obj = new Data_Explorer_Page(driver);
        Data_Explorer_Obj.Z2D_Select_Data_Explorer_dropdown();
        Data_Explorer_Obj.Z2D_Select_Data_Explorer_Tic();
        Data_Explorer_Obj.Z2D_Sandbox_Tab();
        Assert.assertTrue(driver.getCurrentUrl().contains("/dataexplorer/sandbox/myboms"));
    }

}

