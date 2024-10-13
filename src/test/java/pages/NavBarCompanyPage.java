package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavBarCompanyPage extends BasePage {

    public SelenideElement navBarCompany = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[6]");
    public SelenideElement aboutUs = $("div.new-menu-dropdown-layout-6-left-container > a.dropdown-sub:nth-child(1)");
    public SelenideElement newsRoom = $("div.new-menu-dropdown-layout-6-left-container > a.dropdown-sub:nth-child(2)");
    public SelenideElement partnerships = $("div.new-menu-dropdown-layout-6-left-container > a.dropdown-sub:nth-child(3)");
    public SelenideElement technologyPartners = $("div.new-menu-dropdown-layout-6-left-container > a.dropdown-content:nth-child(4)");
    public SelenideElement solutionPartners = $("div.new-menu-dropdown-layout-6-left-container > a.dropdown-content:nth-child(5)");
    public SelenideElement integration = $("div.new-menu-dropdown-layout-6-mid-container > a.dropdown-sub:nth-child(1)");
    public SelenideElement careers = $("div.new-menu-dropdown-layout-6-mid-container > a.dropdown-sub:nth-child(2)");
    public SelenideElement contactUs = $("div.new-menu-dropdown-layout-6-mid-container > a.dropdown-sub:nth-child(3)");


    public NavBarCompanyPage(String pageUrl){
        super(pageUrl);
    }
}
