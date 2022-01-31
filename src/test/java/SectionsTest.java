import org.junit.Assert;
import org.junit.Test;

public class SectionsTest extends PageObject {

    @Test
    public void rollsSectionTest() {
        clickButton("Конструктор");
        clickButton("Соусы");
        clickButton("Булки");
        Assert.assertTrue(sectionIsPresent("Булки"));
    }

    @Test
    public void saucesSectionTest() {
        clickButton("Конструктор");
        clickButton("Соусы");
        Assert.assertTrue(sectionIsPresent("Соусы"));
    }

    @Test
    public void fillingsSectionTest() {
        clickButton("Конструктор");
        clickButton("Начинки");
        Assert.assertTrue(sectionIsPresent("Начинки"));
    }

}
