package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

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

    public CustomersPage(String pageUrl) {
        super(pageUrl);
    }
}
