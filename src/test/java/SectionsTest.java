import PageObject.HelperBase;
import PageObject.SectionsHelper;
import org.junit.Assert;
import org.junit.Test;

public class SectionsTest extends HelperBase {

    @Test
    public void rollsSectionTest() {
        SectionsHelper sectionsHelper = new SectionsHelper();
        clickButton("Конструктор");
        clickButton("Соусы");
        clickButton("Булки");
        Assert.assertTrue("Не выбран раздел 'Булки' на главной странице", sectionsHelper.sectionIsPresent("Булки"));
    }

    @Test
    public void saucesSectionTest() {
        SectionsHelper sectionsHelper = new SectionsHelper();
        clickButton("Конструктор");
        clickButton("Соусы");
        Assert.assertTrue("Не выбран раздел 'Соусы' на главной странице", sectionsHelper.sectionIsPresent("Соусы"));
    }

    @Test
    public void fillingsSectionTest() {
        SectionsHelper sectionsHelper = new SectionsHelper();
        clickButton("Конструктор");
        clickButton("Начинки");
        Assert.assertTrue("Не выбран раздел 'Начинки' на главной странице", sectionsHelper.sectionIsPresent("Начинки"));
    }

}
