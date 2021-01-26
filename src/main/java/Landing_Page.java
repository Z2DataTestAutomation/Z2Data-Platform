
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_Page {
    private final WebDriver driver;

    public Landing_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Data_Explorer Tab
    public By Data_Explorer_dropdown = By.id("dropdownFormObs");
    public By Data_Explorer_Tic = By.cssSelector("a[href='/dataexplorer']");
    public By Obsolescence_Tic = By.xpath("//a[normalize-space()='Obsolescence']");
    public By Compliance_Tic = By.xpath("//a[normalize-space()='Compliance']");
    public By Conflict_Minerals_Tic = By.xpath("//a[normalize-space()='Conflict Minerals']");
    public By Stock_Check_Tic = By.xpath("//a[normalize-space()='Stock Check']");
    public By Events_Tic = By.xpath("//a[normalize-space()='Events']");
    public By SC_Risk_Tic = By.xpath("//a[normalize-space()='SC Risk']");
    public By Supplier_Risk_Tic = By.xpath("//a[normalize-space()='Supplier Risk']");
    public By Admin_Tic = By.xpath("//a[normalize-space()='Admin']");
    public By Support_Ticket_Tic = By.xpath("//a[normalize-space()='Support Ticket']");

    // Discovery Tab
    public By Discovery_dropdown = By.id("dropdownFormObs");
    public By Supplier_Tic = By.xpath("//a[normalize-space()='Suppliers']");
    public By Industries_Tic = By.xpath("//a[normalize-space()='Industries']");

    public By Impact_Analyzer_Tab = By.xpath("//span[normalize-space()='Impact Analyzer']");

    public By Outreach_Tab = By.xpath("//span[normalize-space()='Outreach']");

    //Trackers Tab
    public By Trackers_dropdown = By.xpath("//span[normalize-space()='Trackers']");
    public By PCN_Trackers_Tic = By.xpath("//h5[normalize-space()='PCN Trackers']");
    public By Incident_Tracker_Tic = By.xpath("//h5[normalize-space()='Incident Tracker']");

    public By Reports_Tab = By.xpath("//span[normalize-space()='Reports']");

    public By Alert_Tab = By.xpath("//span[normalize-space()='Alerts']");

    // Search dropdown
    public By Search_dropdown = By.id("dropdownformSearch");
    public By Part_Number_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Part Number']");
    public By Supplier_Search_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Supplier']");
    public By Family_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Family']");
    public By IPN_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='IPN']");
    public By Description_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Description']");
    public By Advanced_Cross_Tic = By.xpath("//div[@class='mainSearchCategory dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Advanced Cross']");
    public By Auto_Search_Icon = By.id("btnautoSearch");
    public By Search_Text_Area = By.id("txtMainBarSearch");



}


