package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CareersPage extends BasePage {

    public SelenideElement carrersBlock = $(".career-load-more");
    public SelenideElement locationsBlock = $("#career-our-location");
    public SelenideElement lifeAtInsider = $("[data-id=\"a8e7b90\"]");
    public SelenideElement seeAllTeamsButton = $x("//a[contains(text(),'See All Teams')]");




    public CareersPage(String pageUrl) {
        super(pageUrl);
    }
}
