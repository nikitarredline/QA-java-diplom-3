import PageObject.DesignerHelper;
import PageObject.HelperBase;
import org.junit.Assert;
import org.junit.Test;

public class DesignerTest extends HelperBase {

    @Test
    public void noLoginDesignerTest() {
        clickButton("Конструктор");
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
        Assert.assertEquals("Не найден текст 'Войти в аккаунт' на главной странице", "Войти в аккаунт", getText("Войти в аккаунт"));
    }

    @Test
    public void noLoginLogoTest() {
        DesignerHelper designerHelper = new DesignerHelper();
        designerHelper.clickLogo();
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
        Assert.assertEquals("Не найден текст 'Войти в аккаунт' на главной странице", "Войти в аккаунт", getText("Войти в аккаунт"));
    }

    @Test
    public void withLoginDesignerTest() {
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        clickButton("Конструктор");
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
        Assert.assertEquals("Не найден текст 'Оформить заказ' на главной странице", "Оформить заказ", getText("Оформить заказ"));
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
    }

    @Test
    public void withLoginLogoTest() {
        DesignerHelper designerHelper = new DesignerHelper();
        inputEmail("testemail@yandex.ru");
        inputPassword("nikitarredline");
        clickButton("Войти");
        designerHelper.clickLogo();
        Assert.assertEquals("Не найден текст 'Соберите бургер' на главной странице", "Соберите бургер", getText("Соберите бургер"));
        Assert.assertEquals("Не найден текст 'Оформить заказ' на главной странице", "Оформить заказ", getText("Оформить заказ"));
        clickButton("Личный Кабинет");
        clickButton("Выход");
        Assert.assertEquals("Не найден текст 'Вход' на странице авторизации", "Вход", getText("Вход"));
    }

}
