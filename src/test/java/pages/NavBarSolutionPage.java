package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.SelenideElement;

public class NavBarSolutionPage extends BasePage{

    public SelenideElement navBarSolution = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[3]");
    public SelenideElement optimizeCustomerAcquisition = $(".new-menu-dropdown-layout-3-left-container > a.dropdown-sub:nth-child(2)");
    public SelenideElement increaseCustomerEngagement = $(".new-menu-dropdown-layout-3-left-container > a.dropdown-sub:nth-child(4)");
    public SelenideElement reduceCustomerChurn = $(".new-menu-dropdown-layout-3-left-container > a.dropdown-sub:nth-child(6)");




    public NavBarSolutionPage(String pageUrl) {
        super(pageUrl);
    }
}
