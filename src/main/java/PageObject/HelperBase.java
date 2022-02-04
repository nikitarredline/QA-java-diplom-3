package PageObject;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HelperBase {

    String email = "testemail@yandex.ru";
    String password = "nikitarredline";
    public String newEmail = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    public String newPassword = RandomStringUtils.randomAlphabetic(10);

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\yandexdriver.exe");
        Configuration.startMaximized=true;
        Configuration.pageLoadStrategy="normal";
        open("https://stellarburgers.nomoreparties.site/login");
    }

    @After
    public void tearDown() {
        clickButton("Личный Кабинет");
        $(By.xpath("//div[@class='input__container']")).isEnabled();
        int countFields = $$(By.xpath("//div[@class='input__container']")).size();
        if (countFields == 3) {
            clickButton("Выход");
            Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
        }
        System.out.println(countFields);
    }

    @Step("Авторизоваться")
    public void authorization() {
        inputEmail(email);
        inputPassword(password);
        clickButton("Войти");
    }

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
