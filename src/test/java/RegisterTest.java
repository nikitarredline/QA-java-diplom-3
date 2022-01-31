import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends PageObject {

    @Test
    public void registerTest() {
        clickButton("Зарегистрироваться");
        inputName();
        inputEmail(email);
        inputPassword(password);
        clickButton("Зарегистрироваться");
        Assert.assertEquals("Вход", getText("Вход"));
    }

    @Test
    public void incorrectPasswordTest() {
        clickButton("Зарегистрироваться");
        inputName();
        inputEmail(email);
        inputIncorrectPassword();
        clickButton("Зарегистрироваться");
        Assert.assertEquals("Некорректный пароль", getText("Некорректный пароль"));
    }
}