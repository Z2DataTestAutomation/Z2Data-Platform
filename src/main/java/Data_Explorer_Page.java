import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data_Explorer_Page {
    private final WebDriver driver;

    public Data_Explorer_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Data_Explorer_ٍSandbox_Page
    // BOMs Tab
    public By BOMs_Tab_ٍSandbox = By.cssSelector("div[class='ulllinks-text']");
    public By Search_Box_ٍSandbox = By.cssSelector("document.querySelector(\"div.position-relative.width-300.mr-1:nth-child(1) > input\")");
    public By Created_By_Btn = By.cssSelector("div.z2customddlist2.dropdown:nth-child(2) > button");
    public By BOM_Name_Btn = By.cssSelector("div.z2customddlist2.dropdown:nth-child(3) > button");
    public By Analyze__Btn = By.cssSelector("div.z2customddlist2.show.dropdown:nth-child(1) > button");
    // All items Tab
    public By All_Items_Tab = By.linkText("All Items");
    public By Folder_Name = By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) a:nth-child(1)");


    // Data_Explorer_PLM_Page
    // BOMs Tab
    public By BOMs_Tab_PLM = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");
    // AVL Tab
    public By AVL_Tab = By.linkText("AVL");
    // Products Tab
    public By Products_Tab = By.cssSelector("body.NewPortalDes.totalcontainer.ng-tns-0-0:nth-child(2) div.maintabs div.panel.blank-panel div.panel-heading ul.nav.nav-tabs.nav-top-border.px-1.square li.nav-item:nth-child(3) a.nav-link > div.ulllinks-text");
    // Product Tree Tab
    public By Products_Tree_Tab = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");
    public By Search_Box_PLM = By.cssSelector("input[placeholder='Search a list..']");
    // Commodity Tab
    public By Commodity_Tab = By.cssSelector("body.NewPortalDes.totalcontainer.ng-tns-0-0:nth-child(2) div.maintabs div.panel.blank-panel div.panel-heading ul.nav.nav-tabs.nav-top-border.px-1.square li.nav-item:nth-child(5) a.nav-link > div.ulllinks-text");
    // Supplier Tab
    public By Supplier_Tab = By.cssSelector("a[class='nav-link active'] div[class='ulllinks-text']");

    //Data_Explorer_ِAdvanced_View
    // MPN View
    public By Toggle_Btn = By.cssSelector("div[class='jtoggler-handle']");
    public By Search_Box_Advanced_View = By.cssSelector("div.input-group.input-group-sm.float-left.width-300:nth-child(1) > input");
    public By Search_glass = By.cssSelector("div[class='input-group input-group-sm float-left width-300'] i[class='icon-Search-Query ic-search font-small-4 cursor-pointer']");
    public By More_filter_Btnn = By.cssSelector("div.input-group.input-group-sm.float-left.width-300:nth-child(1) > input");
    public By MPN_IPN_Switcher = By.cssSelector("div[class='jtoggler-control']");

    // Data_Explorer_ِBOM View
    //MPN and IPN View
    public By ToggleButton = By.cssSelector("div[class='jtoggler-control']");
    public By Morefilterbutton = By.cssSelector("span[class='mr-05 btn-text']");
    public By ItemTypeFilterSearch = By.cssSelector("div[class='Fl_RiskPartFilter z2parametric-contain'] div:nth-child(1) div:nth-child(2) div:nth-child(1) input:nth-child(1)");
    public By FirstPagination = By.cssSelector("li[class='pagination-first page-item disabled']");
    public By PreviousPagination = By.cssSelector("li[class='pagination-prev page-item disabled']");
    public By NextPagination = By.linkText("Next");
    public By LastPagination = By.linkText("Last");



}
