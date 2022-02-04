import PageObject.DesignerHelper;
import PageObject.HelperBase;
import org.junit.Assert;
import org.junit.Test;

public class DesignerTest extends HelperBase {

    @Test
    public void noLoginDesignerTest() {
        clickButton("Конструктор");
        Assert.assertEquals("Не найден текст 'Войти в аккаунт' на главной странице", "Войти в аккаунт", getText("Войти в аккаунт"));
    }

    @Test
    public void noLoginLogoTest() {
        DesignerHelper designerHelper = new DesignerHelper();
        designerHelper.clickLogo();
        Assert.assertEquals("Не найден текст 'Войти в аккаунт' на главной странице", "Войти в аккаунт", getText("Войти в аккаунт"));
    }

    @Test
    public void withLoginDesignerTest() {
        authorization();
        clickButton("Конструктор");
        Assert.assertEquals("Не найден текст 'Оформить заказ' на главной странице", "Оформить заказ", getText("Оформить заказ"));
    }

    @Test
    public void withLoginLogoTest() {
        DesignerHelper designerHelper = new DesignerHelper();
        authorization();
        designerHelper.clickLogo();
        Assert.assertEquals("Не найден текст 'Оформить заказ' на главной странице", "Оформить заказ", getText("Оформить заказ"));
    }

}
