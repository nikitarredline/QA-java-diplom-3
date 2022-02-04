import PageObject.HelperBase;
import PageObject.RegisterHelper;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends HelperBase {

    @Test
    public void registerTest() {
        RegisterHelper registerHelper = new RegisterHelper();
        clickButton("Зарегистрироваться");
        registerHelper.inputName();
        inputEmail(newEmail);
        inputPassword(newPassword);
        clickButton("Зарегистрироваться");
        Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
    }

    @Test
    public void incorrectPasswordTest() {
        RegisterHelper registerHelper = new RegisterHelper();
        clickButton("Зарегистрироваться");
        registerHelper.inputName();
        inputEmail(newEmail);
        registerHelper.inputIncorrectPassword();
        clickButton("Зарегистрироваться");
        Assert.assertEquals("Не найден текст 'Некорректный пароль' на странице регистрации", "Некорректный пароль", getText("Некорректный пароль"));
    }
}