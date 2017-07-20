package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.seleniumhq.jetty9.http.HttpParser.LOG;

/**
 * Created by yurii on 08.02.17.
 */
public class MainPageElements {

    //public WebDriver driver;

    //  All insets
    public static By main_logo = By.xpath("//a[@class=\"logo\"]");
    public static By science_inset = By.id("menu-item-49153");
    public static By study_inset = By.id("menu-item-49141");
    public static By entrance_inset = By.id("menu-item-11");
    public static By life_in_community = By.id("menu-item-49193");
    public static By about_inset = By.id("menu-item-50806");
    //  header inset
    public static By for_students = By.id("menu-item-49208");
    public static By for_graduates = By.id("menu-item-17");
    public static By for_teachers = By.id("menu-item-49225");
    public static By for_media = By.id("menu-item-19");

    //   Main page elements
    public static By important_news = By.xpath("//h3[@class=\"card__heading\"]");   //  important news
    //driver.findElement(By.xpath("//span[contains(text(), \"Фотогалерея\")]"));
    public static By slider_text_title = By.xpath("//div[@class=\"cover__content\"]/div[@class=\"container-fluid\"]/h2");   //  Slider text
    public static By choose_first_news = By.xpath("//header[@class=\"card card--news\"]/a");   //  Main page first news
    public static By choose_all_news = By.xpath("//a[@class=\"text-small mr-1\"]");   //   Main page all news
    public static By choose_all_events = By.xpath("//a[@class=\"text-small all-events\"]");   //   main page all events
    public static By choose_first_event = By.xpath("(//div[@class=\"card card--event\"]/p)[1]");   //   main page first nenws
    public static By main_page_photos = By.xpath("(//div[@class=\"card__text\"]/a)[1]");  // first photo
    public static By main_page_all_photos = By.xpath("(//a[@class=\"text-small ml-2\"])[1]");   //  all photos
    public static By main_page_video = By.xpath("//div[@class=\"card__video\"]");   //  video
    public static By main_page_all_video = By.xpath("(//a[@class=\"text-small ml-2\"])[2]");   //   all videos
}
