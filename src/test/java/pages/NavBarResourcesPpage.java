package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class NavBarResourcesPpage extends BasePage {

    public SelenideElement takePlatformTour = $x("//a[contains(text(),'Take a Platform Tour')]");
    public SelenideElement cdpExplorer = $x("//div /a[contains(text(),'CDP Explorer')]");
    public SelenideElement whatsappExplorer = $x("//div /a[contains(text(),'WhatsApp Explorer')]");
    public SelenideElement smsTemplatesLibrary = $x("//div /a[contains(text(),'SMS Templates Library')]");
    public SelenideElement productivityCalculator = $x("//div /a[contains(text(),'Productivity Calculator')]");


    public NavBarResourcesPpage(String pageUrl) {
        super(pageUrl);
    }
}
