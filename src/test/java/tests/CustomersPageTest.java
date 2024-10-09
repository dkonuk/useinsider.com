package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomersPageTest extends BaseTest{
    @BeforeMethod
    public void before() {
        pageManager.customersPage.open();
        pageManager.homePage.acceptCookies.click();
    }
    @Test
    public void TestCustomersPage(){
        assertThat(pageManager.customersPage.customers.isDisplayed()).isTrue();
    }
}
