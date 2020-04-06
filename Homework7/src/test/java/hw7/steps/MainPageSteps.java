package hw7.steps;

import hw7.PageLocators;
import io.cucumber.java.ru.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.lang.reflect.Field;
import java.util.HashMap;

public class MainPageSteps {
    private PageLocators page = new PageLocators();
    private WebDriver driver = page.driver;
    private WebDriverWait waiter = new WebDriverWait(driver, 5);


    @Дано("заведен новый пользователь")
    public void заведенНовыйПользователь() {
        System.out.println("");
    }

    @Пусть("открыт браузер и введен адрес \"(.*)\"$")
    public void openedBrowserAndEnteredUrl(String url) {
        driver.get(url);
    }

    @И("страница загрузилась")
    public void pageIsDownload() {
        waiter.until(visibilityOf(page.locTitle));
        Assert.assertTrue(page.locTitle.isDisplayed(), "Стартовая страница не загрузилась.");
    }

    @И("выбрана вкладка {string}")
    public void findCategory(String categoryName) {
        System.out.println("0000000");
        waiter.until(elementToBeClickable(getWebElement(categoryName)));
        getWebElement(categoryName).click();
    }

    @И("выбрана иконка поиска")
    public void findIcon() {
        waiter.until(elementToBeClickable(page.locSearch));
        Assert.assertTrue(page.locSearch.isDisplayed(), "Элемент поиска не найден.");
        page.locSearch.click();

    }

    @И("появилось выпадающее поле поиска")
    public void findFormControl() {
        waiter.until(elementToBeClickable(page.locFormControl));
        Assert.assertTrue(page.locFormControl.isDisplayed(), "Элемент выпадающее поле поиска не найден.");
        page.locFormControl.click();
    }

    @И("пользователь вводит \"(.*)\"$")
    public void userEnters(String arg) {
        page.locFormControl.sendKeys(arg);
        page.locFormControl.sendKeys(Keys.ENTER);
    }

    @Тогда("появились результаты поиска")
    public void dropdownSearchHeader() {
        waiter.until(visibilityOf(page.locMediaHeading));
        Assert.assertTrue(page.locMediaHeading.isDisplayed(), "Элемент \"Nika\" не найден.");
    }

    @Тогда("тест завершен")
    public void testQuit() {
        driver.quit();
    }


    @Тогда("пользователь вводит учетные данные")
    public void userEnteredCredentials(HashMap<String, String> params) {
        params.get("login");
        params.get("password");
    }


    private WebElement getWebElement(String name) {
        for (Field field : page.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(FindBy.class)) {
                FindBy annotation = field.getAnnotation(FindBy.class);
                if (annotation.xpath().contains(name)) {
                    try {
                        return (WebElement) field.get(page);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
        throw new IllegalArgumentException("ERROR: there is no such element with name "
                + name + " at page " + this.getClass().getName());
    }

}
