import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends PageObject {

    @Test
    public void noLoginPersonalAccountTest() {
        clickButton("Конструктор");
        clickButton("Личный Кабинет");
        Assert.assertEquals("Вход", getText("Вход"));
    }

    @Test
    public void withLoginPersonalAccountTest() {
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        clickButton("Конструктор");
        clickButton("Личный Кабинет");
        Assert.assertEquals("Профиль", getText("Профиль"));
        clickButton("Выход");
        Assert.assertEquals("Вход", getText("Вход"));
    }

}
