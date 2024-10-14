package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;



public class QualityAssurancePageTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pageManager.careersPage.open();
        pageManager.homePage.acceptCookies.click();
    }
    @Test
    public void TestQualityAssurancePage(){
        pageManager.homePage.seeAllTeamsButton.click();
        actions().scrollToElement(pageManager.careersPage.qualityAssurance).click(pageManager.careersPage.qualityAssurance).perform();
        pageManager.qualityAssurancePage.seeAllQaJobs.click();
        assertThat(url()).contains("department=qualityassurance");
    }
}
