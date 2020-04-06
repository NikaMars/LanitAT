package hw7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLocators extends PageObject {

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
