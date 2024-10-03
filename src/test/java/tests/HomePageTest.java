package tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;


public class HomePageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.homePage.open();
    }

    @Test
    public void TestHomePage() {
        assertThat(pageManager.homePage.getUrl()).isEqualTo("https://useinsider.com/");
        pageManager.homePage.acceptCookies.click();
        pageManager.homePage.navBar.shouldBe(Condition.visible);
        pageManager.homePage.logoReel.shouldBe(Condition.visible);
        Actions actions = Selenide.actions();
        actions.click(pageManager.homePage.whyInsider).pause(100).click(pageManager.homePage.whyInsiderFirstLink).perform();
        actions.click(pageManager.homePage.whyInsider).pause(500).click(pageManager.homePage.whyInsiderSecondLink).perform();
        actions.click(pageManager.homePage.whyInsider).pause(500).click(pageManager.homePage.whyInsiderThirdLink).perform();
        }



    }

