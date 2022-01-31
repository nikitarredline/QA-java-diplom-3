import org.junit.Assert;
import org.junit.Test;

public class DesignerTest extends PageObject {

    @Test
    public void noLoginDesignerTest() {
        clickButton("Конструктор");
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void noLoginLogoTest() {
        clockLogo();
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
    }

    @Test
    public void withLoginDesignerTest() {
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        clickButton("Конструктор");
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Вход", getText("Вход"));
    }

    @Test
    public void withLoginLogoTest() {
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        clockLogo();
        Assert.assertEquals("Соберите бургер", getText("Соберите бургер"));
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Вход", getText("Вход"));
    }

}
