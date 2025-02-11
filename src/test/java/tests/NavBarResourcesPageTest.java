package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class NavBarResourcesPageTest extends BaseTest{
    @BeforeMethod
    public void before(){
        pageManager.navBarResourcesPage.open();
        acceptCookies();
    }
    @Test
    public void TestNavBarResourcesPage(){
        Actions actions = Selenide.actions();
        actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesPage.takePlatformTour).pause(500).perform();
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesPage.cdpExplorer).perform();
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesPage.whatsappExplorer).perform();
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesPage.smsTemplatesLibrary).perform();
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        actions.click(pageManager.navBarResourcesPage.navBarResources).click(pageManager.navBarResourcesPage.productivityCalculator).perform();

    }
}
