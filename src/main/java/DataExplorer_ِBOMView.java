import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataExplorer_ِBOMView {
    WebDriver driver;
    public DataExplorer_ِBOMView (WebDriver driver){this.driver=driver;}

    //MPN and IPN View
    public By ToggleButton = By.cssSelector("div[class='jtoggler-control']");
    public By Morefilterbutton = By.cssSelector("span[class='mr-05 btn-text']");
    public By ItemTypeFilterSearch = By.cssSelector("div[class='Fl_RiskPartFilter z2parametric-contain'] div:nth-child(1) div:nth-child(2) div:nth-child(1) input:nth-child(1)");
    public By FirstPagination = By.cssSelector("li[class='pagination-first page-item disabled']");
    public By PreviousPagination = By.cssSelector("li[class='pagination-prev page-item disabled']");
    public By NextPagination = By.linkText("Next");
    public By LastPagination = By.linkText("Last");







}
