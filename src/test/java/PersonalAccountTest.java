import PageObject.HelperBase;
import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends HelperBase {

    @Test
    public void noLoginPersonalAccountTest() {
        clickButton("Конструктор");
        clickButton("Личный Кабинет");
        Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
    }

    @Test
    public void withLoginPersonalAccountTest() {
        authorization();
        clickButton("Конструктор");
        clickButton("Личный Кабинет");
        Assert.assertEquals("Не найден текст 'Профиль' на странице 'Личный кабинет'", "Профиль", getText("Профиль"));
    }

}
