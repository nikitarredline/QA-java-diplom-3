import PageObject.HelperBase;
import org.junit.Assert;
import org.junit.Test;

public class ExitTest extends HelperBase {

    @Test
    public void exitTest() {
        authorization();
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
    }

}
