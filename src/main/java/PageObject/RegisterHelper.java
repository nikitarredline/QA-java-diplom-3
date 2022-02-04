package PageObject;

import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterHelper {

    String newName = RandomStringUtils.randomAlphabetic(10);
    String incorrectPassword = RandomStringUtils.randomAlphabetic(5);

    @Step("Ввести имя")
    public void inputName() {
        $(By.xpath("//*[text()='Имя']/following::input[1]")).sendKeys(newName);
    }

    @Step("Ввести некорректный пароль")
    public void inputIncorrectPassword() {
        $(By.xpath("//*[text()='Пароль']/following::input[1]")).sendKeys(incorrectPassword);
    }

}
