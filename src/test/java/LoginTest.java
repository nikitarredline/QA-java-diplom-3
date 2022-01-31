import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends PageObject {

    @Test
    public void loginMainPageTest() {
        clickButton("Конструктор");
        clickButton("Войти в аккаунт");
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void loginRegisterPageTest() {
        clickButton("Зарегистрироваться");
        clickButton("Войти");
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void loginRecoverPassTest() {
        clickButton("Восстановить пароль");
        clickButton("Войти");
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
    }

    @After
    public void provisionPostconditions() {
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Вход", getText("Вход"));
    }

}
