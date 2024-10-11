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
        pageManager.homePage.acceptCookies.click();
    }
}
