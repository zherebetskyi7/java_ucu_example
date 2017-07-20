package functions;

import org.openqa.selenium.WebDriver;
import pages.SciencePageElements;

/**
 * Created by yurii on 17.02.17.
 */
public class SciencePageFunctions
{
    private static void click_on_science_inset(WebDriver driver)
    {
        AllInsetsFunctions.click_on_science_inset(driver);
    }

    //   Institutes
    public static void choose_church_institute(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_history_churches).getText().equals("Інститут історії Церкви");
        driver.findElement(SciencePageElements.institute_history_churches).click();
        driver.getTitle().equals("Інститут Історії Церкви | Українського Католицького Університету");
    }
    public static void choose_managment_institute(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_managment).getText().equals("Інститут лідерства на управління");
        driver.findElement(SciencePageElements.institute_managment).click();
        driver.getCurrentUrl().equals("http://management.lviv.ua/");
    }
    public static void choose_liturgy_science(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_liturgy_science).getText().equals("Інститут літургійних наук");
        driver.findElement(SciencePageElements.institute_liturgy_science).click();
        driver.getTitle().equals("ILS – ILS UCU");
    }
    public static void choose_mental_health(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_mental_health).getText().equals("Інститут психічного здоров’я");
        driver.findElement(SciencePageElements.institute_mental_health).click();
        driver.getCurrentUrl().equals("http://ipz.ucu.edu.ua/");
    }
    public static void choose_religion_community(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_religion_community).getText().equals("Інститут релігії та суспільства");
        driver.findElement(SciencePageElements.institute_religion_community).click();
        driver.getTitle().equals("Інститут Релігії та суспільства | Інститут Релігії та суспільства");
    }
    public static void choose_family(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_family).getText().equals("Інститут родини та подружнього життя");
        driver.findElement(SciencePageElements.institute_family).click();
        driver.getCurrentUrl().equals("http://family-institute.org.ua/");
    }
    public static void choose_catechetical(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.institute_catechetical).getText().equals("Катехитично-педагогічний інститут");
        driver.findElement(SciencePageElements.institute_catechetical).click();
        driver.getTitle().equals("Катехитично-педагогічний інститут");
    }

    //   Blocks
    public static void click_on_science_department(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.block_science_department).getAttribute("title").equals("Науковий відділ");
        driver.findElement(SciencePageElements.block_science_department).click();
        driver.getTitle().equals("Науковий відділ | Український Католицький Університет");
    }
    public static void click_on_repository(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.block_repository).getAttribute("title").equals("Репозитарій");
        driver.findElement(SciencePageElements.block_repository).click();
        driver.getCurrentUrl().equals("http://er.ucu.edu.ua/");
    }
    public static void click_on_opportunities_and_training(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.block_opportunities).getAttribute("title").equals("Можливості, стажування");
        driver.findElement(SciencePageElements.block_opportunities).click();
        driver.getCurrentUrl().equals("http://abroad.ucu.edu.ua/");
    }
    public static void click_on_edition(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.block_edition).getAttribute("title").equals("Видавництво");
        driver.findElement(SciencePageElements.block_edition).click();
        driver.getCurrentUrl().equals("http://press.ucu.edu.ua/");
    }
    public static void click_on_ucu_events(WebDriver driver)
    {
        click_on_science_inset(driver);
        driver.findElement(SciencePageElements.block_events_ucu).getAttribute("title").equals("Події УКУ");
        driver.findElement(SciencePageElements.block_events_ucu).click();
        driver.getTitle().equals("Події Archive - UCU");
    }
}
