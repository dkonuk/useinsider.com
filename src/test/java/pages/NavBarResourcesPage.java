package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class NavBarResourcesPage extends BasePage {
    public SelenideElement navBarResources = $x("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[5]");
    public SelenideElement takePlatformTour = $x("//a[contains(text(),'Take a Platform Tour')]");
    public SelenideElement cdpExplorer = $x("//div /a[contains(text(),'CDP Explorer')]");
    public SelenideElement whatsappExplorer = $x("//div /a[contains(text(),'WhatsApp Explorer')]");
    public SelenideElement smsTemplatesLibrary = $x("//div /a[contains(text(),'SMS Templates Library')]");
    public SelenideElement productivityCalculator = $x("//div /a[contains(text(),'Productivity Calculator')]");


    public NavBarResourcesPage(String pageUrl) {
        super(pageUrl);
    }

}
