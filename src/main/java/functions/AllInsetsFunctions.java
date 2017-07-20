package functions;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
import pages.MainPageElements;
//import settings.OpenBrowser;

/**
 * Created by yurii on 07.02.17.
 */
public class AllInsetsFunctions //extends OpenBrowser
{
    //public WebDriver driver;
    //   return title
    private static void print_title(WebDriver driver)
    {
        System.out.println("Title is: " + driver.getTitle());
    }
/*
* Functions for all insets click
* */
    public static void click_on_entry_inset(WebDriver driver)
    {
        driver.findElement(MainPageElements.entrance_inset).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        driver.getTitle().equals("Вступникам. Український Католицький Університет | Для вступників");
    }
    public static void click_on_logo(WebDriver driver)
    {
        driver.findElement(MainPageElements.main_logo).click();
        driver.getTitle().equals("Головна - UCU");
        print_title(driver);
    }
    public static void click_on_science_inset(WebDriver driver)
    {
        driver.findElement(MainPageElements.science_inset).click();
        driver.getTitle().equals("Наука - UCU");
        print_title(driver);
    }
    public static void click_on_study_inset(WebDriver driver)
    {
        driver.findElement(MainPageElements.study_inset).click();
        driver.getTitle().equals("Навчання - UCU");
        print_title(driver);
    }
    /*public static void click_on_entrance_inset(WebDriver driver)
    {
        driver.findElement(MainPageElements.entrance_inset).click();
        driver.switchTo().window();
        driver.getTitle().equals("Навчання - UCU");
    }*/
    public static void click_on_life_in_community(WebDriver driver)
    {
        driver.findElement(MainPageElements.life_in_community).click();
        driver.getTitle().equals("ЖИТТЯ СПІЛЬНОТИ - UCU");
        print_title(driver);
    }
    public static void click_on_about_inset(WebDriver driver)
    {
        driver.findElement(MainPageElements.about_inset).click();
        driver.getTitle().equals("Про УКУ - UCU");
        print_title(driver);
    }
    public static void click_on_students(WebDriver driver)
    {
        driver.findElement(MainPageElements.for_students).click();
        driver.getTitle().equals("Студентам - UCU");
        print_title(driver);
    }
    // doesn't work now
    public static void click_on_for_graduates(WebDriver driver)
    {
        driver.findElement(MainPageElements.for_graduates).click();
        driver.getTitle().equals("#");
        print_title(driver);
    }
    public static void click_on_for_teachers(WebDriver driver)
    {
        driver.findElement(MainPageElements.for_teachers).click();
        driver.getTitle().equals("ВИКЛАДАЧАМ ТА ПРАЦІВНИКАМ - UCU");
        print_title(driver);
    }
    // doesn't work now
    public static void click_on_for_media(WebDriver driver)
    {
        driver.findElement(MainPageElements.for_media).click();
        driver.getTitle().equals("#");
        print_title(driver);
    }

}
