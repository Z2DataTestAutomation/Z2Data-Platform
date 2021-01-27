import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataExplorer_ِAdvancedView {
    WebDriver driver;
    public  DataExplorer_ِAdvancedView(WebDriver driver){this.driver = driver;}

    // MPN View & IPN View
    public By ToggleButton = By.cssSelector("div[class='jtoggler-handle']");
    public By SearchBox = By.cssSelector("div.input-group.input-group-sm.float-left.width-300:nth-child(1) > input");
    public By Searchglass = By.cssSelector("div[class='input-group input-group-sm float-left width-300'] i[class='icon-Search-Query ic-search font-small-4 cursor-pointer']");
    public By Morefilterbutton = By.cssSelector("span[class='mr-05 btn-text']");














}
