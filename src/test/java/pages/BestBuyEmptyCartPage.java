package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestBuyEmptyCartPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
    }
    @Test
    void validateCard(){

        driver.findElement(By.id("KATYYYYYYY"));
    }
}
