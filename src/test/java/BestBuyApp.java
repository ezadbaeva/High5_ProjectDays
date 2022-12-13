import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestBuyApp {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://www.bestbuy.com/");
    }
    @Test
    void fileUploadTest(){
            driver.get("https://the-internet.herokuapp.com/upload");
            final String path = "/Users/techtorialacademy/IdeaProjects/selenium-testng/src/test/java/testResources/sample.txt";
            driver.findElement(By.id("file-upload")).sendKeys(path);
            driver.findElement(By.id("file-submit")).click();
            WebElement header = driver.findElement(By.tagName("h3"));
            final String expectedHeader = "File Uploaded!";
            Assert.assertEquals(header.getText(),expectedHeader);
            WebElement uploadedFileName = driver.findElement(By.id("uploaded-files"));
            Assert.assertTrue(path.endsWith(uploadedFileName.getText()));
        }

}
