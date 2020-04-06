package hw7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import hw7.webdriver.WebDriverManager;


public class PageObject {

    public WebDriver driver;

    public PageObject() {
        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

}
