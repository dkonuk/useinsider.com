package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;



public class QualityAssurancePageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.careersPage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestQualityAssurancePage() {
        pageManager.homePage.seeAllTeamsButton.click();
        actions().scrollToElement(pageManager.careersPage.qualityAssurance).click(pageManager.careersPage.qualityAssurance).perform();
        pageManager.qualityAssurancePage.seeAllQaJobs.click();
        assertThat(url()).contains("department=qualityassurance");
        pageManager.qualityAssurancePage.departmentFilter.shouldBe(visible);
        pageManager.qualityAssurancePage.locationFilter.click();
        actions().scrollToElement(pageManager.qualityAssurancePage.locationselectxpath).click(pageManager.qualityAssurancePage.locationselectxpath).perform();
        actions().pause(500).perform();
        assertThat(pageManager.qualityAssurancePage.jobsList.size()).isGreaterThan(0);
        List<String> jobTexts = pageManager.qualityAssurancePage.jobsList.texts();
        for (String jobText : jobTexts) {
            assertThat(jobText).contains("Quality Assurance");
            assertThat(jobText).contains("Istanbul, Turkey");
            assertThat(jobText).contains("View Role");
        }
        pageManager.qualityAssurancePage.viewRoleButton.click();
        Selenide.switchTo().window(1);
        assertThat(url()).contains("lever");
        }
    }

