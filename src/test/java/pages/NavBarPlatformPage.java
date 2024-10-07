package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;


public class NavBarPlatformPage extends BasePage {
    public SelenideElement navBarPlatform = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[2]");
    public SelenideElement customerProfiles = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(4)");
    public SelenideElement predictBehavior = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(5)");
    public SelenideElement audienceSegmentation = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(6)");
    public NavBarPlatformPage(String pageUrl) {
        super(pageUrl);
    }
}
