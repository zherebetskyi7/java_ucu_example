package pages.footer;

import org.openqa.selenium.By;

/**
 * Created by yurii on 22.02.17.
 */
public class FooterElements
{
    private static String footer_urls = "(//div[@class=\"footer__menu\"]/ul/li)";

    //   Study
    public static By faculties = By.xpath(footer_urls + "[1]");
    public static By centers_and_institutes = By.xpath(footer_urls + "[2]");
    public static By programs = By.xpath(footer_urls + "[3]");
    public static By summer_schools = By.xpath(footer_urls + "[4]");
    //   Science
    public static By science_institutes = By.xpath(footer_urls + "[5]");
    public static By science_centers = By.xpath(footer_urls + "[6]");
    public static By resources_science = By.xpath(footer_urls + "[7]");
    public static By graduate_school = By.xpath(footer_urls + "[8]");
    public static By science_department = By.xpath(footer_urls + "[9]");
    //   About UCU
    public static By for_students = By.xpath(footer_urls + "[10]");
    public static By for_graduates = By.xpath(footer_urls + "[11]");
    public static By for_teachers = By.xpath(footer_urls + "[12]");
    public static By for_media = By.xpath(footer_urls + "[13]");

    //   Buttons
    public static By become_a_student = By.xpath("//a[@title=\"СТАТИ СТУДЕНТОМ\"]");
    public static By support_ucu = By.xpath("//a[@title=\"ПІДТРИМАТИ УКУ\"]");
}
