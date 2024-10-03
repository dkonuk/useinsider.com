package common;

import driver.DriverFactory;
import pages.*;

import java.sql.Driver;

public class PageManager {
    public HomePage homePage;


    public PageManager() {
        DriverFactory.initDriver();
        homePage = PageFactory.buildHomePage();
    }
}
