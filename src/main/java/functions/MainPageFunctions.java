package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.MainPageElements;

/**
 * Created by yurii on 09.02.17.
 */
public class MainPageFunctions
{
    private static String text;
    private WebDriver driver;

    private static void print_title(WebDriver driver)
    {
        System.out.println("Title is: " + driver.getTitle());
    }

    //   click on important news
    public static void important_news(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[contains(text(), \"Важливо\")]"));
        text = driver.findElement(MainPageElements.important_news).getText();
        driver.findElement(MainPageElements.important_news).click();
        driver.getTitle().equals(text + " - UCU");
        print_title(driver);
    }

    //   click on slider photo
    public static void slider_title(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.slider_text_title).getText();
        System.out.println(text);
        driver.findElement(MainPageElements.slider_text_title).click();
        driver.getTitle().equals(text + " - UCU");
        print_title(driver);
    }

    //   click on first news
    public static void first_news(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.choose_first_news).getText();
        System.out.println(text);
        driver.findElement(MainPageElements.choose_first_news).click();
        driver.getTitle().equals(text + " - UCU");
        print_title(driver);
    }

    //  click on all news
    public static void all_news(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.choose_all_news).getAttribute("title");
        text.equals("УСІ НОВИНИ");
        driver.findElement(MainPageElements.choose_all_news).click();
        driver.getTitle().equals("Новини - UCU");
        print_title(driver);
    }

    //  click on all events
    public static void all_events(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.choose_all_events).getAttribute("title");
        text.equals("УСІ ПОДІЇ");
        driver.findElement(MainPageElements.choose_all_events).click();
        driver.getTitle().equals("Події - UCU");
        print_title(driver);
    }

    //   click on first news
    public static void first_event(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.choose_first_event).getText();
        System.out.println(text);
        driver.findElement(MainPageElements.choose_first_event).click();
        driver.getTitle().equals(text + " - UCU");
        print_title(driver);
    }

    //   click on first photos
    public static void main_page_photo(WebDriver driver)
    {
        text = driver.findElement(MainPageElements.main_page_photos).getAttribute("title");
        System.out.println(text);
        driver.findElement(MainPageElements.main_page_photos).click();
        driver.getTitle().equals(text + " - UCU");
        print_title(driver);
    }

    //   click on all photos
    public static void main_page_all_photos(WebDriver driver)
    {
        driver.findElement(MainPageElements.main_page_all_photos).click();
        driver.getTitle().equals("Фотогалерея - UCU");
    }

    //   click on video
    public static void main_page_video(WebDriver driver)
    {
        driver.findElement(MainPageElements.main_page_video).click();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
    }

    //   click on all videos
    public static void main_page_all_videos(WebDriver driver)
    {
        driver.findElement(MainPageElements.main_page_all_video).click();
        driver.getTitle().equals("Відео галерея - UCU");
    }
/*
    //   support UCU button
    public static void support_ucu_button(WebDriver driver)
    {
        driver.findElement(MainPageElements.support_ucu_button).getAttribute("title").equals("ПІДТРИМАТИ УКУ");
        driver.findElement(MainPageElements.support_ucu_button).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        driver.getTitle().equals("Чому підтримати УКУ | Кампанія УКУ");
    }

    //   become a student button
    public static void become_student_button(WebDriver driver)
    {
        driver.findElement(MainPageElements.become_a_student_button).getAttribute("title").equals("СТАТИ СТУДЕНТОМ");
        driver.findElement(MainPageElements.become_a_student_button).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        driver.getTitle().equals("Вступникам. Український Католицький Університет | Для вступників");
    }
*/
}
