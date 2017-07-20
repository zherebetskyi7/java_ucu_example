package pages.header;

import org.openqa.selenium.By;

/**
 * Created by yurii on 21.02.17.
 */
public class HeaderInsetsElements
{
    /*
    *   For students
    */
    private static String resources = "(//a[@class=\"resources__item\"])";
    private static String four_blocks = "(//a[@class=\"info-tile\"])";

    public static By students_center_career = By.xpath(resources + "[1]");
    public static By deanery_of_students = By.xpath(resources + "[2]");
    public static By collegium = By.xpath(resources + "[3]");
    public static By dinner_hall = By.xpath(resources + "[4]");

    public static By council_of_students = By.xpath("//a[@href=\"http://studrada.ucu.edu.ua/\"]");
            // additional features
    public static By semester_abroad = By.xpath("//a[@href=\"http://abroad.ucu.edu.ua/\"]");
    public static By studying_features = By.xpath("//a[@href=\"http://ucu.edu.ua/divisions/international/grants/\"]");
    public static By events_calendar = By.xpath("//a[@href=\"http://ucu.office.qubstudio.com/events/\"]");

    public static By request_for_references = By.xpath(four_blocks + "[1]");
    public static By students_documents_center = By.xpath(four_blocks + "[2]");
    public static By students_tickets = By.xpath(four_blocks + "[3]");
    public static By paying_for_studying = By.xpath(four_blocks + "[4]");

    /*
    *   For graduates
    */


    /*
    *   For teachers
    */
    private static String resources_teachers = "(//a[@class=\"arrow-r\"])";

    public static By opportunities_and_training = By.xpath(resources + "[1]");
    public static By study_center = By.xpath(resources + "[2]");
    //   urls
    public static By administrative_policies = By.xpath(resources_teachers + "[1]");
    public static By administrative_offices = By.xpath(resources_teachers + "[2]");
    public static By new_stuff_welcome_center = By.xpath(resources_teachers + "[3]");
    public static By language_training = By.xpath(resources_teachers + "[5]");
    public static By hr_department = By.xpath(resources_teachers + "[6]");

    /*
    *   For media
    */
}
