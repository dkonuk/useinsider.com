package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class NavBarPlatformRightPage extends BasePage {
    public String midContainer = ".new-menu-dropdown-layout-2-mid-container";
    public String childSelector = "a.dropdown-sub-sub";
    public int nthChild;



    public NavBarPlatformRightPage(String pageUrl) {
        super(pageUrl);
    }
    public SelenideElement getWebElement() {
        return $("div.new-menu-dropdown-layout-2-mid-container > a.dropdown-sub-sub:nth-child(" + nthChild + ")");
    }
}
