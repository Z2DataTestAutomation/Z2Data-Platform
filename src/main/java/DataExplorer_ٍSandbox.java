import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataExplorer_ٍSandbox {
    WebDriver driver;

    public DataExplorer_ٍSandbox (WebDriver driver){this.driver =driver;}
     // BOMs Tab
    public By BOMTab = By.cssSelector("div[class='ulllinks-text']");
    public By SearchBox = By.cssSelector("document.querySelector(\"div.position-relative.width-300.mr-1:nth-child(1) > input\")");
    public By CreatedByButton = By.cssSelector("div.z2customddlist2.dropdown:nth-child(2) > button");
    public By BOMNameButton = By.cssSelector("div.z2customddlist2.dropdown:nth-child(3) > button");
    public By AnalyzeButton = By.cssSelector("div.z2customddlist2.show.dropdown:nth-child(1) > button");
    // All items Tab
    public By AllItemsTab = By.linkText("All Items");
    public By FolderName = By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) a:nth-child(1)");

}
