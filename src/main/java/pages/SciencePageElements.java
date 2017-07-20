package pages;

import org.openqa.selenium.By;

/**
 * Created by yurii on 17.02.17.
 */
public class SciencePageElements
{
    private static String institute = "(//a[@style=\"text-decoration: none;\"])";
    private static String block = "(//a[@class=\"info-tile\"])";

    //   links to institutes url
    public static By institute_history_churches = By.xpath(institute + "[1]");
    public static By institute_managment = By.xpath(institute + "[2]");
    public static By institute_liturgy_science = By.xpath(institute + "[3]");
    public static By institute_mental_health = By.xpath(institute + "[4]");
    public static By institute_religion_community = By.xpath(institute + "[5]");
    public static By institute_family = By.xpath(institute + "[6]");
    public static By institute_catechetical = By.xpath(institute + "[7]");

    //   blocks urls
    public static By block_science_department = By.xpath(block + "[1]");
    public static By block_repository = By.xpath(block + "[2]");
    public static By block_opportunities = By.xpath(block + "[3]");
    public static By block_edition = By.xpath(block + "[4]");
    public static By block_events_ucu = By.xpath(block + "[5]");
}
