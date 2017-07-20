package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.StudiesPageElements;

/**
 * Created by yurii on 16.02.17.
 */
public class StudiesPageFunctions {

    private static void click_on_study_inset(WebDriver driver)
    {
        AllInsetsFunctions.click_on_study_inset(driver);
    }

    public static void click_on_become_student(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.become_student_button).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        driver.getTitle().equals("Вступникам. Український Католицький Університет | Для вступників");
    }

    public static void click_on_bachelor_program(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.bachelor_speciality_program_link).click();
        driver.getTitle().equals("Спеціальності | Вступникам. Український Католицький Університет");
    }

    public static void click_on_master_program(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.master_speciality_program_link).click();
        driver.getTitle().equals("Магістерські програми | Вступникам. Український Католицький Університет");
    }

    public static void click_on_graduate(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.graduate_program_link).click();
        driver.getTitle().equals("Аспірантура УКУ | Аспірантура УКУ");
    }

    public static void choose_LVBS(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.lviv_business_school_link).click();
        driver.getTitle().equals("LvBS | Львівська бізнес-школа УКУ (LvBS)");
    }

    public static void sertificate_programs(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.sertificate_program).getAttribute("title").equals("Сертифікатні програми");
        driver.findElement(StudiesPageElements.sertificate_program).click();
        driver.getTitle().equals("Додаткові навчальні програми | Вступникам. Український Католицький Університет");
    }

    public static void language_school(WebDriver driver)
    {
        click_on_study_inset(driver);
        driver.findElement(StudiesPageElements.language_school).getAttribute("title").equals("Мовні школи");
        driver.findElement(StudiesPageElements.language_school).click();
        driver.getTitle().equals("English Summer School - Center of Modern Foreign Languages");
    }
}
