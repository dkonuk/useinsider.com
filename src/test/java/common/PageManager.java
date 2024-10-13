package common;

import driver.DriverFactory;
import pages.*;

import java.sql.Driver;

public class PageManager {
    public HomePage homePage;
    public NavBarSolutionPage navBarSolutionPage;
    public NavBarPlatformPage navBarPlatformPage;
    public NavBarPlatformRightPage navBarPlatformRightPage;
    public CustomersPage customersPage;
    public NavBarResourcesPage navBarResourcesPage; // Updated class name
    public NavBarResourcesRightPage navBarResourcesRightPage;

    public PageManager() {
        DriverFactory.initDriver();
        homePage = PageFactory.buildHomePage();
        navBarSolutionPage =PageFactory.buildNavBarSolutionPage();
        navBarPlatformPage = PageFactory.buildNavBarPlatformPage();
        navBarPlatformRightPage = PageFactory.buildNavBarPlatformRightPage();
        navBarSolutionPage = PageFactory.buildNavBarSolutionPage();
        customersPage = PageFactory.buildCustomersPage();
        navBarResourcesPage = PageFactory.buildNavBarResourcesPage(); // Updated method name
        navBarResourcesRightPage = PageFactory.buildNavBarResourcesRightPage();
    }
}