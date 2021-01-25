import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataExplorer_PLMVault {
    WebDriver driver;
    public DataExplorer_PLMVault(WebDriver driver){this.driver=driver;}
    // BOMs Tab
    public By BOMsTab = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");

    // AVL Tab
    public By AVLTab = By.linkText("AVL");

    // Products Tab
    public By ProductsTab = By.cssSelector("body.NewPortalDes.totalcontainer.ng-tns-0-0:nth-child(2) div.maintabs div.panel.blank-panel div.panel-heading ul.nav.nav-tabs.nav-top-border.px-1.square li.nav-item:nth-child(3) a.nav-link > div.ulllinks-text");

    // Product Tree Tab
    public By ProductsTreeTab = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");
    public By SearchBox = By.cssSelector("input[placeholder='Search a list..']");

    // Commodity Tab
    public By CommodityTab = By.cssSelector("body.NewPortalDes.totalcontainer.ng-tns-0-0:nth-child(2) div.maintabs div.panel.blank-panel div.panel-heading ul.nav.nav-tabs.nav-top-border.px-1.square li.nav-item:nth-child(5) a.nav-link > div.ulllinks-text");

    // Supplier Tab
    public By SupplierTab = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");

}
