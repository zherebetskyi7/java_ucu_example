package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.MainPageElements;

import java.util.concurrent.TimeUnit;

/**
 * Created by yurii on 07.02.17.
 */
public class OpenBrowser {

    private String url = "https://ucu.edu.ua/ua/";
    protected WebDriver driver;
    protected MainPageElements mainPageElements;

    @BeforeMethod
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.valueOf(20), TimeUnit.SECONDS);

        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}
