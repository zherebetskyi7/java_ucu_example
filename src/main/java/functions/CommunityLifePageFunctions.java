package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CommunityLifePageElements;

/**
 * Created by yurii on 21.02.17.
 */
public class CommunityLifePageFunctions
{
    private static void click_on_campus_life(WebDriver driver)
    {
        AllInsetsFunctions.click_on_life_in_community(driver);
    }

    //   Block with ColonyInformation; Campus ministry; Documents
    /*public static void click_on_colony_information(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.information_about_colony).click();
        //
    }
    public static void click_on_ministry_url(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.ministry_url).click();
        //
    }
    public static void click_on_documents_url(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.documents_url).click();
        //
    }*/

    //   Blocks Services and Students life
    // Services
    public static void dinning_room_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.dinning_room).getText().equals("Трапезна");
        driver.findElement(CommunityLifePageElements.dinning_room).click();
    }
    public static void collegium_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.collegium).getText().equals("Колегіум");
        driver.findElement(CommunityLifePageElements.collegium).click();
        driver.findElement(By.xpath("(//div[@class=\"the_content col-sm-12 col-lg-7 pull-right\"]/p)[4]")).getText().equals("Колегіум — місце, в якому твориться спільнота Університету. Тут живуть, навчаються і працюють понад 200 студентів, із якими мешкають викладачі-куратори, сестри-редимптористки, особи з особливими потребами та гостьові професори, які приїжджають викладати в Університеті.");
    }
    public static void conference_service_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.conference_service).getText().equals("Конференц-сервіс");
        driver.findElement(CommunityLifePageElements.conference_service).click();
        if (driver.findElement(CommunityLifePageElements.more_about_conference).isDisplayed())
            System.out.println("Element is");
        else
            System.out.println("No element");
        //driver.findElement(CommunityLifePageElements.more_about_conference).click();
        //driver.getTitle().equals("Колегіум Йосифа Сліпого - УКУ");
    }
    // Students life
    public static void entrance_into_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.entrance_into).getText().equals("Для вступників");
        driver.findElement(CommunityLifePageElements.entrance_into).click();
        driver.findElement(CommunityLifePageElements.formation_program_url).click();
        driver.getTitle().equals("Освітньо-формаційна програма \"Християнська духовність у пост-модерній добі\" | Колегіум УКУ");
    }
    public static void formation_program_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.formation_program).getText().equals("Формаційна програма");
        driver.findElement(CommunityLifePageElements.formation_program).click();
        driver.findElement(CommunityLifePageElements.university_mission_url).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        driver.getTitle().equals("Візія та місія | Український Католицький Університет");
    }
    public static void college_workshops_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.college_workshops).getText().equals("Гуртки Колегіуму");
        driver.findElement(CommunityLifePageElements.college_workshops).click();
        driver.findElement(CommunityLifePageElements.detailed_shedule_url).click();
        driver.getTitle().equals("План роботи гуртків Колегіуму | Колегіум УКУ");
    }

    //  Block with museum, emaus
    // museums
    public static void more_about_museum_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.more_about_museum).click();
        driver.getTitle().equals("Музей Патріарха Йосифа Сліпого | Український Католицький Університет");
    }
    // emaus
    public static void more_about_emuas_inset(WebDriver driver)
    {
        click_on_campus_life(driver);
        driver.findElement(CommunityLifePageElements.more_about_emuas).click();
        driver.getTitle().equals("Емаус | Центр духовної підтримки осіб з особливими потребами");
    }
}
