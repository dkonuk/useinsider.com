package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class QualityAssurancePage extends BasePage {

    public SelenideElement qualityAssurance = $x("//h3[contains(text(),'Quality Assurance')]");
    public SelenideElement seeAllQaJobs = $x("//a[contains(text(),'See all QA jobs')]");





    public QualityAssurancePage(String pageUrl) {
        super(pageUrl);
    }
}
