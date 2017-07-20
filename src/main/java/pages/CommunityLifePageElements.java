package pages;

import org.openqa.selenium.By;

/**
 * Created by yurii on 21.02.17.
 */
public class CommunityLifePageElements
{
    // Campus ministry and Documents
    private static String ministry_and_document = "(//a[@class=\"arrow-right\"])";
    private static String services_and_students_life = "(//a[@data-toggle=\"pill\"])";



    // button "Інформація про поселення"
    public static By information_about_colony = By.xpath("//*[contains(text(), \"ІНФОРМАЦІЯ ПРО ПОСЕЛЕННЯ\")]");

    // urls to ministry and documents
    public static By ministry_url = By.xpath(ministry_and_document + "[1]");
    public static By documents_url = By.xpath(ministry_and_document + "[2]");

    // change insets in services block
    public static By dinning_room = By.xpath(services_and_students_life + "[1]");
    public static By collegium = By.xpath(services_and_students_life + "[2]");
    public static By conference_service = By.xpath(services_and_students_life + "[3]");
        public static By more_about_conference = By.xpath("//a[@href=\"http://collegium.ucu.edu.ua/\"]");
    // change insets in students life block
    public static By entrance_into = By.xpath(services_and_students_life + "[4]");
        public static By formation_program_url = By.xpath("//*[contains(text(), \"формаційній програмі\")]");
    public static By formation_program = By.xpath(services_and_students_life + "[5]");
        public static By university_mission_url = By.xpath("//*[contains(text(), \"місії Університету\")]");
    public static By college_workshops = By.xpath(services_and_students_life + "[6]");
        public static By detailed_shedule_url = By.xpath("//*[contains(text(), \"детальний розклад\")]");

    // museum, EMUAS
    public static By more_about_museum = By.xpath("//*[contains(text(), \"Більше про Музей\")]");
    public static By more_about_emuas = By.xpath("//*[contains(text(), \"Більше про “ЕМУАС”\")]");
}
