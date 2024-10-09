package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CustomersPage extends BasePage {

    public SelenideElement customers = $("[data-id=\"f0d4d97\"] > .elementor-widget-container");
    public SelenideElement slidingCustomerBanner = $("[data-id=\"6a9ef14\"] > .elementor-widget-container");
    public SelenideElement enterpriseButton = $("#e-n-tab-title-1786903871");
    public SelenideElement highgrowthButton = $("#e-n-tab-title-1786903872");
    public SelenideElement toyotaSelection = $x("//div[contains(text(),'uplift in test-drive applications')]");
    public SelenideElement vodafoneSelection = $x("//div[contains(text(),'increase in ARPU')]");
    public SelenideElement adidasSelection = $x("//div[contains(text(),'increase in AOV')]");
    public SelenideElement toyotaCaseStudy = $("#brand-details-1");
    public SelenideElement vodafoneCaseStudy = $("#brand-details-2");
    public SelenideElement adidasCaseStudy = $("#brand-details-3");
    public SelenideElement nakdSelection = $x("//div[contains(text(),'increased lifetime value')]");
    public SelenideElement madeiraSelection = $x("//div[contains(text(),'return of Investments (ROI)')]");
    public SelenideElement belgianSelection = $x("//div[contains(text(),'faster campaign execution')]");
    public SelenideElement nakdCaseStudy = $x("//*[contains(text(), 'achieved ROI')]");
    public SelenideElement madeiraCaseStudy = $x("//*[contains(text(), 'Madeira')]");
    public SelenideElement belgianCaseStudy = $x("//*[contains(text(), 'Belgian')]");
    public String industrySliderParent = "div.industry-industry-nav:nth-child(2)";
    public String industrySliderchildren = "button.industry-industry-button";
    public int nthChild;
    public String businessObjectiveSlider = "div.objective-objective-nav:nth-child(2)";
    public String businessObjectiveChildren = " button.objective-objective-button";
    public SelenideElement businessObjectiveNextButton = $(".objective-slider-navigation:nth-child(10) > button.objective-slider-next");
    public SelenideElement businessObjectivePreviousButton = $(".objective-slider-navigation:nth-child(10) > button.objective-slider-prev");
    public ElementsCollection businessObjectiveElements = $$(".objective-slider-item");



    public CustomersPage(String pageUrl) {
        super(pageUrl);
    }
    public SelenideElement getIndustrySliderWebElement() {
        return $("div.industry-industry-nav:nth-child(2) > button.industry-industry-button:nth-child(" + nthChild + ")");
    }
    public SelenideElement getBusinessObjectiveSliderWebElement() {
        return $("div.objective-objective-nav:nth-child(2) > button.objective-objective-button:nth-child(" + nthChild + ")");
    }
    public SelenideElement getBusinessObjectiveButtonsWebElement() {
        return $("button.objective-visible-on-mobile.objective-slider-next:nth-child(" + nthChild + ")");
    }
}
