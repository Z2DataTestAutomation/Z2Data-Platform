import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data_Explorer_Page {
    private final WebDriver driver;

    public Data_Explorer_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Data_Explorer Tab
    public By Data_Explorer_dropdown = By.xpath("//app-header-products-risk//a[@id='dropdownFormObs']");
    public By Data_Explorer_Tic = By.cssSelector("a[href='/dataexplorer']");
    // Data_Explorer_ٍSandbox_Page
    // BOMs Tab
    public By Sandbox_Tab = By.xpath("//a[normalize-space()='Sandbox']");
    public By BOMs_Tab_ٍSandbox = By.cssSelector("div[class='ulllinks-text']");
    public By Search_Box_ٍSandbox = By.cssSelector("document.querySelector(\"div.position-relative.width-300.mr-1:nth-child(1) > input\")");
    public By Created_By_Btn = By.cssSelector("div.z2customddlist2.dropdown:nth-child(2) > button");
    public By BOM_Name_Btn = By.cssSelector("div.z2customddlist2.dropdown:nth-child(3) > button");
    public By Analyze__Btn = By.cssSelector("div.z2customddlist2.show.dropdown:nth-child(1) > button");
    // All items Tab
    public By All_Items_Tab = By.linkText("All Items");
    public By Folder_Name = By.cssSelector("tbody tr:nth-child(1) td:nth-child(1) a:nth-child(1)");


    // Data_Explorer_PLM_Page
    public By PLM_Vault_Tab = By.xpath("//a[normalize-space()='PLM Vault']");
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
    public By Advanced_View_Tab = By.id("subLinksAdvancedView");
    // MPN View
    public By Toggle_Btn = By.cssSelector("div[class='jtoggler-handle']");
    public By Search_Box_Advanced_View = By.cssSelector("div.input-group.input-group-sm.float-left.width-300:nth-child(1) > input");
    public By Search_glass = By.cssSelector("div[class='input-group input-group-sm float-left width-300'] i[class='icon-Search-Query ic-search font-small-4 cursor-pointer']");
    public By More_filter_Btn = By.cssSelector("div.input-group.input-group-sm.float-left.width-300:nth-child(1) > input");
    public By MPN_IPN_Switcher = By.cssSelector("div[class='jtoggler-control']");

    // Data_Explorer_ِBOM View
    //MPN and IPN View
    public By Toggle_Btn_BOM_View = By.cssSelector("div[class='jtoggler-control']");
    public By More_filter_Btn_BOM_View = By.cssSelector("span[class='mr-05 btn-text']");
    public By Item_Type_Filter_Search = By.cssSelector("div[class='Fl_RiskPartFilter z2parametric-contain'] div:nth-child(1) div:nth-child(2) div:nth-child(1) input:nth-child(1)");
    public By First_Pagination = By.cssSelector("li[class='pagination-first page-item disabled']");
    public By Previous_Pagination = By.cssSelector("li[class='pagination-prev page-item disabled']");
    public By Next_Pagination = By.linkText("Next");
    public By Last_Pagination = By.linkText("Last");


    //Data Explorer Drop list
    public void Z2D_Select_Data_Explorer_dropdown() {
        ElementActions.click(driver, Data_Explorer_dropdown);
    }

    public void Z2D_Select_Data_Explorer_Tic() {
        ElementActions.click(driver, Data_Explorer_Tic);
    }

    //Data Explorer Sandbox Methods
    public void Z2D_Sandbox_Tab() {
        ElementActions.click(driver, Sandbox_Tab);
    }

    public void Z2D_Search_Box_sandbox(String Data_Search) {
        ElementActions.type(driver, Search_Box_ٍSandbox, Data_Search);
    }

    //Data Explorer PLM Methods
    public void Z2D_PLM_Vault_Tab() {
        ElementActions.click(driver, PLM_Vault_Tab);
    }

    public void Z2D_Search_Box_PLM(String Data_Search) {
        ElementActions.type(driver, Search_Box_PLM, Data_Search);
    }

    //Data Explorer Advanced View Methods
    public void Z2D_Advanced_View_Tab() {
        ElementActions.click(driver, Advanced_View_Tab);
    }

    public void Z2D_Search_Box_Advanced_View(String Data_Search) {
        ElementActions.type(driver, Search_Box_Advanced_View, Data_Search);
    }



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
