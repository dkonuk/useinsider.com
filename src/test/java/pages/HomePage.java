package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends BasePage{

    public SelenideElement acceptCookies  = $("#wt-cli-accept-all-btn");
    public SelenideElement navBar = $x("//*[@class=\"navbar-nav\"]");
    public SelenideElement logoReel = $("#home_logo_reel");
    public SelenideElement whyInsider = $x("//*[@id='navbarDropdownMenuLink']");
    public SelenideElement whyInsiderFirstLink = $("a[href='https://useinsider.com/why-insider']");
    public SelenideElement whyInsiderSecondLink = $("a[href='https://useinsider.com/compare-insider/']");
    public SelenideElement whyInsiderThirdLink = $("a[href='https://useinsider.com/insider-switch/']");
    public SelenideElement seeAllTeamsButton = $x("//a[contains(text(),'See all teams')]");



    public HomePage(String pageUrl) {
        super(pageUrl);
    }

}
