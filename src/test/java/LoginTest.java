import PageObject.HelperBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends HelperBase {

    @Test
    public void loginMainPageTest() {
        clickButton("Конструктор");
        clickButton("Войти в аккаунт");
        authorization();
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void loginRegisterPageTest() {
        clickButton("Зарегистрироваться");
        clickButton("Войти");
        authorization();
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void loginRecoverPassTest() {
        clickButton("Восстановить пароль");
        clickButton("Войти");
        authorization();
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
    }

}
