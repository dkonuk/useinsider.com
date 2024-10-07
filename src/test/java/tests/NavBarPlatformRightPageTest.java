package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavBarPlatformRightPage;


import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class NavBarPlatformRightPageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.navBarPlatformRightPage.open();
        pageManager.homePage.acceptCookies.click();
    }
    @Test
    public void TestNavBarPlatformRightPage() {
        int childSize = iterateOverAllChildren(pageManager.navBarPlatformRightPage.midContainer, pageManager.navBarPlatformRightPage.childSelector);
        System.out.println(childSize);
        for (pageManager.navBarPlatformRightPage.nthChild = 2; pageManager.navBarPlatformRightPage.nthChild <= childSize; pageManager.navBarPlatformRightPage.nthChild++) {
            Actions actions = Selenide.actions();
            actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformRightPage.getWebElement()).perform();
        }
    }

    @Test
    public void TestNavBarPlatformRightPage2() {
        // Get the number of children dynamically
        ElementsCollection children = $$(".new-menu-dropdown-layout-2-mid-container > a.dropdown-sub-sub");
        int childSize = children.size();
        System.out.println(childSize);

        // Iterate over each child element
        for (int i = 2; i <= childSize; i++) {
            String childSelector = ".new-menu-dropdown-layout-2-mid-container > a.dropdown-sub-sub:nth-child(" + i + ")";
            SelenideElement childElement = $(childSelector);

            Actions actions = Selenide.actions();
            actions.click(pageManager.navBarPlatformPage.navBarPlatform)
                   .click(childElement)
                   .perform();
        }



    }
}
