package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SectionsHelper {

    @Step("Раздел выбран")
    public boolean sectionIsPresent(String text) {
        if ($(By.xpath("//span[text()='" + text +"']/parent::div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']")).isDisplayed()) {
            return true;
        } else return false;
    }

}
