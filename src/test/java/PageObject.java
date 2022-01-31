import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageObject {

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\yandexdriver.exe");
        open("https://stellarburgers.nomoreparties.site/login");
    }

    String email = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    String password = RandomStringUtils.randomAlphabetic(10);
    String name = RandomStringUtils.randomAlphabetic(10);
    String incorrectPassword = RandomStringUtils.randomAlphabetic(5);

    public void inputName() {
        $(By.xpath("//*[text()='Имя']/following::input[1]")).sendKeys(name);
    }

    public void inputEmail(String email) {
        $(By.xpath("//*[text()='Email']/following::input[1]")).sendKeys(email);
    }

    public void inputPassword(String password) {
        $(By.xpath("//*[text()='Пароль']/following::input[1]")).sendKeys(password);
    }

    public void inputIncorrectPassword() {
        $(By.xpath("//*[text()='Пароль']/following::input[1]")).sendKeys(incorrectPassword);
    }

    public void clickButton(String text) {
            $(By.xpath("//*[text()='" + text + "']")).click();
    }

    public String getText(String text) {
        return $(By.xpath("//*[text()='" + text + "']")).getText();
    }

    public void clockLogo() {
        $(By.xpath("//div[@class='AppHeader_header__logo__2D0X2']")).click();
    }

    public boolean sectionIsPresent(String text) {
        if ($(By.xpath("//span[text()='" + text +"']/parent::div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']")).isDisplayed()) {
            return true;
        } else return false;
    }

}
