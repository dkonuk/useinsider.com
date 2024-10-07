package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import common.PageManager;
import driver.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static driver.DriverFactory.maximize;

public class BaseTest {
    protected PageManager pageManager = new PageManager();
    protected SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void setUp() {
        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void openDriver(){
        Selenide.open();
        maximize();
    }

    @AfterMethod
    public void clearCookies() {
        DriverFactory.clearCookies();
    }

    @AfterClass
    public void tearDown(){
        DriverFactory.close();
    }

    public int iterateOverAllChildren(String cssSelector, String childSelector) {

        SelenideElement parentElements = $(cssSelector);
        ElementsCollection childElements = parentElements.$$(childSelector);
        return childElements.size();


    }

}
