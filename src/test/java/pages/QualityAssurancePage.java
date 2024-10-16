package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class QualityAssurancePage extends BasePage {

    public SelenideElement seeAllQaJobs = $x("//a[contains(text(),'See all QA jobs')]");
    public SelenideElement locationFilter = $("[id=select2-filter-by-location-container]");
    public SelenideElement departmentFilter = $("[id=\"select2-filter-by-department-container\"][title=\"Quality Assurance\"]");
    public SelenideElement locationselectxpath = $x("//*[@class='select2-results__option'][text()='Istanbul, Turkey']");
    public ElementsCollection jobsList = $$("[id=\"jobs-list\"]");
    public SelenideElement viewRoleButton = $x("//a[contains(text(),'View Role')]");





    public QualityAssurancePage(String pageUrl) {
        super(pageUrl);
    }
}
