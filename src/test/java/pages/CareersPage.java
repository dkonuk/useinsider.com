package pages;

import com.codeborne.selenide.SelenideElement;

import java.lang.reflect.Field;
import java.util.function.Consumer;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CareersPage extends BasePage {

    public SelenideElement carrersBlock = $(".career-load-more");
    public SelenideElement locationsBlock = $("#career-our-location");
    public SelenideElement lifeAtInsider = $("[data-id=\"a8e7b90\"]");
    public SelenideElement customerSuccess = $x("//h3[contains(text(),'Customer Success')]");
    public SelenideElement sales = $x("//h3[contains(text(),'Sales')]");
    public SelenideElement productEngineering = $x("//h3[contains(text(),'Product & Engineering')]");
    public SelenideElement financeBusinessSupport = $x("//h3[contains(text(),'Finance & Business Support')]");
    public SelenideElement marketing = $x("//h3[contains(text(),'Marketing')]");
    public SelenideElement ceoExecutiveOffice = $x("//h3[contains(text(),'CEO’s Executive Office')]");
    public SelenideElement purchasingOperations = $x("//h3[contains(text(),'Purchasing & Operations')]");
    public SelenideElement peopleCulture = $x("//h3[contains(text(),'People and Culture')]");
    public SelenideElement businessIntelligence = $x("//h3[contains(text(),'Business Intelligence')]");
    public SelenideElement securityEngineering = $x("//h3[contains(text(),'Security Engineering')]");
    public SelenideElement partnership = $x("//h3[contains(text(),'Partnership')]");
    public SelenideElement qualityAssurance = $x("//h3[contains(text(),'Quality Assurance')]");
    public SelenideElement mobileBusinessUnit = $x("//h3[contains(text(),'Mobile Business Unit')]");
    public SelenideElement partnerSupportDevelopment = $x("//h3[contains(text(),'Partner Support Development')]");
    public SelenideElement productDesign = $x("//h3[contains(text(),'Product Design')]");





    public CareersPage(String pageUrl) {
        super(pageUrl);
    }
    public void forEachSelenideElement(Consumer<SelenideElement> action) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == SelenideElement.class) {
                try {
                    SelenideElement element = (SelenideElement) field.get(this);
                    action.accept(element);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
}
        }
    }
}
