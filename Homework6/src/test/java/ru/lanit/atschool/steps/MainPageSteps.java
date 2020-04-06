package ru.lanit.atschool.steps;

import io.cucumber.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.lanit.atschool.webdriver.WebDriverManager;

import java.util.HashMap;

public class MainPageSteps {
    private WebDriver driver = WebDriverManager.getDriver();
//    protected Wait<WebDriver> wait = new WebDriverWait(WebDriverManager.getDriver(), 100, 1000);

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
        WebElement webElement = driver.findElement(By.xpath("//h1[text()='Lanit education']"));
        Assert.assertTrue(webElement.isDisplayed(), "Стартовая страница не загрузилась.");
    }

    @И("выбрана вкладка Категории")
    public void findCategory()  {
        WebElement webElement = driver.findElement(By.xpath("//nav//a[normalize-space(.)='Категории']"));
        Assert.assertTrue(webElement.isDisplayed(), "Элемент 'Категории' не найден.");
        webElement.click();
        sleep1s();
    }

    @И("выбрана вкладка Пользователи")
    public void findUsers() {
        WebElement webElement = driver.findElement(By.xpath("//*[@href='/users/']"));
        Assert.assertTrue(webElement.isDisplayed(), "Элемент 'Пользователи' не найден.");
        webElement.click();
        sleep1s();
    }

    @И("выбрана иконка поиска")
    public void findIcon() {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='navbar-search dropdown']"));
        Assert.assertTrue(webElement.isDisplayed(), "Элемент поиска не найден.");
        webElement.click();
        sleep1s();
    }

    @И("появилось выпадающее поле поиска")
    public void findFormControl() {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='form-control']"));
        Assert.assertTrue(webElement.isDisplayed(), "Элемент выпадающее поле поиска не найден.");
        webElement.click();
    }

    @И("пользователь вводит \"(.*)\"$")
    public void userEnters(String arg0) {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='form-control']"));
        webElement.sendKeys("Nika");
        webElement.sendKeys(Keys.ENTER);
    }

    @Тогда("появились результаты поиска")
    public void dropdownSearchHeader() {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='media-heading']"));
        Assert.assertTrue(webElement.isDisplayed(), "Элемент \"Nika\" не найден.");
        sleep1s();
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


    private void sleeps(){
        try {
            Thread.sleep(250);
        }catch (InterruptedException e){

        }
    }
}
