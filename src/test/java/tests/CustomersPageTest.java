package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


import static org.assertj.core.api.Assertions.assertThat;

public class CustomersPageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.customersPage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestCustomersPage() {
        assertThat(pageManager.customersPage.customers.isDisplayed()).isTrue();
        assertThat(pageManager.customersPage.slidingCustomerBanner.isDisplayed()).isTrue();
        pageManager.customersPage.enterpriseButton.click();
        pageManager.customersPage.toyotaSelection.click();
        assertThat(pageManager.customersPage.toyotaCaseStudy.isDisplayed()).isTrue();
        pageManager.customersPage.vodafoneSelection.click();
        assertThat(pageManager.customersPage.vodafoneCaseStudy.isDisplayed()).isTrue();
        pageManager.customersPage.adidasSelection.click();
        assertThat(pageManager.customersPage.adidasCaseStudy.isDisplayed()).isTrue();
        pageManager.customersPage.highgrowthButton.click();
        pageManager.customersPage.nakdSelection.click();
        assertThat(pageManager.customersPage.nakdCaseStudy.isDisplayed()).isTrue();
        pageManager.customersPage.madeiraSelection.click();
        assertThat(pageManager.customersPage.madeiraCaseStudy.isDisplayed()).isTrue();
        pageManager.customersPage.belgianSelection.click();
        assertThat(pageManager.customersPage.belgianCaseStudy.isDisplayed()).isTrue();
        int childSize = iterateOverAllChildren(pageManager.customersPage.industrySliderParent, pageManager.customersPage.industrySliderchildren);
        for (pageManager.customersPage.nthChild = 1; pageManager.customersPage.nthChild <= childSize; pageManager.customersPage.nthChild++) {
            Actions actions = Selenide.actions();
            actions.click(pageManager.customersPage.getIndustrySliderWebElement()).perform();
        }
        int businessObjectiveSliderChildSize = iterateOverAllChildren(pageManager.customersPage.businessObjectiveSlider, pageManager.customersPage.businessObjectiveChildren);
        for (pageManager.customersPage.nthChild = 1; pageManager.customersPage.nthChild <= businessObjectiveSliderChildSize; pageManager.customersPage.nthChild++) {
            Actions actions = Selenide.actions();
            actions.click(pageManager.customersPage.getBusinessObjectiveSliderWebElement()).perform();
        }
        int businessObjectiveButtonChildSize = iterateOverAllChildren(pageManager.customersPage.businessObjectiveButtonsParent, pageManager.customersPage.businessObjectiveButtonsChildren);
        System.out.println(businessObjectiveButtonChildSize);
        for (pageManager.customersPage.nthChild = 1; pageManager.customersPage.nthChild <= businessObjectiveButtonChildSize; pageManager.customersPage.nthChild++) {
            pageManager.customersPage.businessObjectiveNextButton.click();
            Actions actions = Selenide.actions();
        actions.pause(5000).perform();
        }
        for (pageManager.customersPage.nthChild = 1; pageManager.customersPage.nthChild <= businessObjectiveButtonChildSize; pageManager.customersPage.nthChild++) {
            pageManager.customersPage.businessObjectivePreviousButton.click();
            Actions actions = Selenide.actions();
        actions.pause(5000).perform();
        }

    }
}