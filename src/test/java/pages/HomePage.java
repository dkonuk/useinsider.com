package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends BasePage{

    public SelenideElement acceptCookies  = $("#wt-cli-accept-all-btn");
    public SelenideElement navBar = $x("//*[@class=\"navbar-nav\"]");
    public SelenideElement logoReel = $("#home_logo_reel");
    public SelenideElement whyInsider = $x("//*[@id='navbarDropdownMenuLink']");
    public SelenideElement whyInsiderFirstLink = $("a[href='https://useinsider.com/why-insider']");
    public SelenideElement whyInsiderSecondLink = $("a[href='https://useinsider.com/compare-insider/']");
    public SelenideElement whyInsiderThirdLink = $("a[href='https://useinsider.com/insider-switch/']");
    public SelenideElement navBarPlatform = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[2]");
    public SelenideElement customerProfiles = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(4)");
    public SelenideElement audienceSegmentation = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(6)");

    public HomePage(String pageUrl) {
        super(pageUrl);
    }

}
