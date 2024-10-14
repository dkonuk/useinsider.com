package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class CareersPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.careersPage.open();
        pageManager.homePage.acceptCookies.click();

    }
    @Test
    public void TestCareersPage() {
        pageManager.homePage.seeAllTeamsButton.click();
        pageManager.careersPage.forEachSelenideElement(element -> {
            try {
                //element.click();
                // You might want to add some verification after each click
                // For example:
                // assertTrue(element.isDisplayed());

                assertThat(element.isDisplayed()).isTrue();
                System.out.println("Clicked element: " + element);
                Actions actions = Selenide.actions();
                actions.pause(100).perform();
            } catch (Exception e) {
                System.out.println("Could not click element: " + element);
                e.printStackTrace();
            }
        });
    }
    @Test
    public void TestCareersPageQA() {
        pageManager.homePage.seeAllTeamsButton.click();
        pageManager.careersPage.qualityAssurance.click();
        assertThat(url()).contains("quality-assurance");

    }
}
