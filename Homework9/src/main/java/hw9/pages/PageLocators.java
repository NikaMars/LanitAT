package hw9.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLocators extends PageObject {
    private final Logger logger = Logger.getLogger(PageLocators.class);

    /**
     * Метод открывает браузер на заданной странице
     * страница задается в файле config.properties.
     */
    public void openPage(String url) {
        driver.get(url);
        logger.info("Выполнен вход на страницу: " + url);
    }

    @FindBy(xpath = "//h1[text()='Lanit education']")
    public WebElement locTitle;

    @FindBy(xpath = "//nav//a[normalize-space(.)='Категории']")
    public WebElement locCategory;

    @FindBy(xpath = "//a[normalize-space(.)='Пользователи']")
    public WebElement locUsers;

    @FindBy(xpath = "//*[@class='navbar-search dropdown']")
    public WebElement locSearch;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement locFormControl;

    @FindBy(xpath = "//*[@class='media-heading']")
    public WebElement locMediaHeading;

}
