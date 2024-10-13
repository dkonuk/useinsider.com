package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class NavBarCompanyPageTest extends BaseTest {
    @BeforeMethod
    public void before() {
        pageManager.navBarCompanyPage.open();
        pageManager.homePage.acceptCookies.click();
    }

    @Test
    public void TestNavBarCompanyPage() {
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.aboutUs.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.newsRoom.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.partnerships.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.technologyPartners.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.solutionPartners.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.integration.click();
        Selenide.back();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.careers.click();
        pageManager.navBarCompanyPage.navBarCompany.click();
        pageManager.navBarCompanyPage.contactUs.click();
    }
}
