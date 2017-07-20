package pages;

import org.openqa.selenium.By;

/**
 * Created by yurii on 16.02.17.
 */
public class StudiesPageElements
{
    public static By become_student_button = By.xpath("//a[@class=\"btn btn-outline mt-1 mb-1\"]");
    public static By bachelor_speciality_program_link = By.xpath("(//*[contains(text(), \"Спеціальності та умови вступу\")])[1]");
    public static By master_speciality_program_link = By.xpath("(//*[contains(text(), \"Спеціальності та умови вступу\")])[2]");
    public static By graduate_program_link = By.xpath("//*[contains(text(), \"Умови вступу\")]");
    public static By lviv_business_school_link = By.xpath("//a[@href=\"http://lvbs.com.ua/\"]");
    public static By sertificate_program = By.xpath("(//a[@class=\"info-tile\"])[1]");
    public static By language_school = By.xpath("(//a[@class=\"info-tile\"])[2]");
}
