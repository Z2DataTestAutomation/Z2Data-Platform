import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Base {

    public static WebDriver driver ;
    public Page_Base(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements( driver,this);
    }
}