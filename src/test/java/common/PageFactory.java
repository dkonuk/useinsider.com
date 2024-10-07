package common;

import pages.*;

public class PageFactory {
    public static HomePage buildHomePage() {
        return new HomePage("");
    }

    public static NavBarSolutionPage buildNavBarSolutionPage() {
        return new NavBarSolutionPage("");
    }
    public static NavBarPlatformPage buildNavBarPlatformPage() {
        return new NavBarPlatformPage("");
    }
    public static NavBarPlatformRightPage buildNavBarPlatformRightPage() {
        return new NavBarPlatformRightPage("");
    }
}
