package common;

import driver.DriverFactory;
import pages.*;

import java.sql.Driver;

public class PageManager {


    public PageManager() {
        DriverFactory.initDriver();
    }
}
