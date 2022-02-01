package PageObject;

import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HelperBase {

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\yandexdriver.exe");
        open("https://stellarburgers.nomoreparties.site/login");
    }

    public String email = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    public String password = RandomStringUtils.randomAlphabetic(10);

    @Step("Ввести email")
    public void inputEmail(String email) {
        $(By.xpath("//*[text()='Email']/following::input[1]")).sendKeys(email);
    }

    @Step("Ввести пароль")
    public void inputPassword(String password) {
        $(By.xpath("//*[text()='Пароль']/following::input[1]")).sendKeys(password);
    }

    @Step("Нажать кнопку")
    public void clickButton(String text) {
        $(By.xpath("//*[text()='" + text + "']")).click();
    }

    @Step("Получить текст")
    public String getText(String text) {
        return $(By.xpath("//*[text()='" + text + "']")).getText();
    }

}
