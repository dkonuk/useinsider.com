package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class NavBarResourcesRightPageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.navBarResourcesRightPage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestNavBarResourcesRightPage() {
        int childSize = iterateOverAllChildren(pageManager.navBarResourcesRightPage.navBarResourcesRight, pageManager.navBarResourcesRightPage.navBarResourcesRightChildren);
        for (pageManager.navBarResourcesRightPage.nthChild = 2; pageManager.navBarResourcesRightPage.nthChild <= childSize; pageManager.navBarResourcesRightPage.nthChild++) {
            Actions actions = Selenide.actions();
            actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesRightPage.getWebElement()).perform();
        }
    }
}
