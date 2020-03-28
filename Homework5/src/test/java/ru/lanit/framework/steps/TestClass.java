package ru.lanit.framework.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

import java.util.List;

public class TestClass {

    @Test
    public void testLanit() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
        webDriver.get("https://dev.n7lanit.ru/");

        WebElement webElement1 = webDriver.findElement(By.xpath("//*[@href='/categories/']"));
        Assert.assertTrue(webElement1.isDisplayed(),
                "Элемент \"Категории\"");
        Thread.sleep(1000);
        webElement1.click();
        Thread.sleep(1000);

        WebElement webElement2 = webDriver.findElement(By.xpath("//*[@href='/users/']"));
        Assert.assertTrue(webElement2.isDisplayed(), "Элемент \"Пользователи\"");
        Thread.sleep(1000);
        webElement2.click();
        Thread.sleep(1000);

        WebElement webElement3 = webDriver.findElement(By.xpath("//*[@class='navbar-search dropdown']"));
        webElement3.click();
        Thread.sleep(1000);
        WebElement webElement4 = webDriver.findElement(By.xpath("//*[@class='form-control']"));
        Thread.sleep(1000);
        webElement4.sendKeys("Nika");
        Thread.sleep(1000);
        webElement4.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement webElement5 = webDriver.findElement(By.xpath("//*[@class='media-heading']"));
        Assert.assertTrue(webElement5.isDisplayed(), "Элемент \"Nika\"");

        webDriver.quit();

    }

}
