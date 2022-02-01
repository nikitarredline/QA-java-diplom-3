package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DesignerHelper {

    @Step("Нажать логотип Stellar Burgers")
    public void clickLogo() {
        $(By.xpath("//div[@class='AppHeader_header__logo__2D0X2']")).click();
    }

}
