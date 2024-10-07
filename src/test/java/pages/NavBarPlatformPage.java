package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;


public class NavBarPlatformPage extends BasePage {
    public SelenideElement navBarPlatform = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[2]");
    public SelenideElement customerProfiles = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(4)");
    public SelenideElement predictBehavior = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(5)");
    public SelenideElement audienceSegmentation = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(6)");
    public SelenideElement integrations = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(7)");
    public SelenideElement recomendations   = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(9)");
    public SelenideElement visualProductDiscovery = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(10)");
    public SelenideElement preBuildTemplates = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(11)");
    public SelenideElement siteSearch = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(12)");
    public SelenideElement abTesting  = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(13)");
    public SelenideElement journeyOrchestration = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(14)");
    public SelenideElement insightsAndAnalytics = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(15)");
    public SelenideElement behavioralAnalytics = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(16)");
    public SelenideElement aiLearning = $("div.new-menu-dropdown-layout-2-left-container > a:nth-child(17)");
    public NavBarPlatformPage(String pageUrl) {
        super(pageUrl);
    }
}
