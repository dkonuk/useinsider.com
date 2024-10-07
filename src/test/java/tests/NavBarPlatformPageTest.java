package tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.back;
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
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.integrations).perform();
        back();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.recomendations).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.visualProductDiscovery).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.preBuildTemplates).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.siteSearch).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.abTesting).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.journeyOrchestration).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.insightsAndAnalytics).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.behavioralAnalytics).perform();
        actions.click(pageManager.navBarPlatformPage.navBarPlatform).click(pageManager.navBarPlatformPage.aiLearning).perform();
    }
}
