package tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;

import static org.assertj.core.api.Assertions.assertThat;

public class NavBarPlatformPageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.navBarPlatformPage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestNavBarPlatformPage() {
        Actions actions = Selenide.actions();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.customerProfiles).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.audienceSegmentation).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.predictBehavior).perform();
    }
}
