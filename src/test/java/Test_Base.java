import com.google.protobuf.ByteString;
import com.shaft.gui.browser.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.annotation.Priority;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Test_Base {

   /*public static WebDriver driver;
   String TestURL = "https://app1.z2data.com";
    @BeforeSuite
     public void Open_Driver() {
        Login_Page loginpageOBJ = new Login_Page(driver) ;
      driver = BrowserFactory.getBrowser(BrowserFactory.BrowserType.GOOGLE_CHROME);
      driver.manage().window().maximize();
     // driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
         driver.navigate().to(TestURL);
        loginpageOBJ.Z2D_SignIn();
    }


   @AfterMethod
    public void Backtolandpage(){
                                                                                                                                                                                                                                                                                                                         driver.navigate().to(TestURL);

   /*
   public void Takescreenshot(ITestResult result) throws IOException {

        if (ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot TS = (TakesScreenshot) driver;
            File source = TS.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshot/" + result.getName()+".png"));

   @AfterSuite

    public void Close_Driver(){
       driver.manage().deleteAllCookies();
       driver.quit();
   }

*/
}
