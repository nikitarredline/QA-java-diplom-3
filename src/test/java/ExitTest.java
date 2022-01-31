import org.junit.Assert;
import org.junit.Test;

public class ExitTest extends PageObject {

    @Test
    public void exitTest() {
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Вход", getText("Вход"));
    }

}
