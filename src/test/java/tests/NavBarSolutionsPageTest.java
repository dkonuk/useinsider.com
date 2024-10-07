package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.WebDriverRunner.url;

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
        assertThat(url()).contains("onboarding");
        actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.increaseCustomerEngagement).perform();
        assertThat(url()).contains("engagement");
        actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.reduceCustomerChurn).perform();
        assertThat(url()).contains("churn");
        int childSize = iterateOverAllChildren(pageManager.navBarSolutionPage.midContainer, pageManager.navBarSolutionPage.childSelector);
        for (pageManager.navBarSolutionPage.nthChild = 2; pageManager.navBarSolutionPage.nthChild <= childSize; pageManager.navBarSolutionPage.nthChild++) {
            actions.click(pageManager.navBarSolutionPage.navBarSolution).click(pageManager.navBarSolutionPage.getWebElement()).perform();
        }

    }
}
