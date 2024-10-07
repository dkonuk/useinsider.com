package common;

import driver.DriverFactory;
import pages.*;

import java.sql.Driver;

public class PageManager {
    public HomePage homePage;
    public NavBarSolutionPage navBarSolutionPage;
    public NavBarPlatformPage navBarPlatformPage;
    public NavBarPlatformRightPage navBarPlatformRightPage;


    public PageManager() {
        DriverFactory.initDriver();
        homePage = PageFactory.buildHomePage();
        navBarSolutionPage =PageFactory.buildNavBarSolutionPage();
        navBarPlatformPage = PageFactory.buildNavBarPlatformPage();
        navBarPlatformRightPage = PageFactory.buildNavBarPlatformRightPage();
    }

}
