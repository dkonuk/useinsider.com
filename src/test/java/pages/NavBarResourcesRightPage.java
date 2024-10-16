package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavBarResourcesRightPage extends BasePage {
    public String navBarResourcesRight = ".new-menu-dropdown-layout-5-mid-container";
    public String navBarResourcesRightChildren = "a.dropdown-sub-sub";
    public int nthChild;

    public NavBarResourcesRightPage(String pageUrl){
        super(pageUrl);
    }
    public SelenideElement getWebElement() {
        return $("div.new-menu-dropdown-layout-5-mid-container > a.dropdown-sub-sub:nth-child(" + nthChild + ")");
    }
}
