package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class NavBarSolutionsPageTest extends BaseTest {

    @BeforeMethod
    public void before() {
        pageManager.homePage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestNavBarSolutionsPage(){
        Actions actions = Selenide.actions();
        actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.optimizeCustomerAcquisition).perform();
        actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.increaseCustomerEngagement).perform();
        actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.reduceCustomerChurn).perform();
//        assertThat(pageManager.navBarSolutionPage.optimizeCustomerAcquisition).hasText("Optimize Customer Acquisition");
//        assertThat(pageManager.navBarSolutionPage.increaseCustomerEngagement).hasText("Increase Customer Engagement");
//        assertThat(pageManager.navBarSolutionPage.reduceCustomerChurn).hasText("Reduce Customer Churn");

    }
}
