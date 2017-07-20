package tests.studies;

import functions.StudiesPageFunctions;
import org.testng.annotations.Test;
import settings.OpenBrowser;
import functions.AllInsetsFunctions;

/**
 * Created by yurii on 16.02.17.
 */
public class VerifyLinksStudiesPage extends OpenBrowser
{
    @Test
    public void become_student()
    {
        StudiesPageFunctions.click_on_become_student(driver);
    }

    @Test
    public void bachelor_progarm()
    {
        StudiesPageFunctions.click_on_bachelor_program(driver);
    }

    @Test
    public void master_program()
    {
        StudiesPageFunctions.click_on_master_program(driver);
    }

    @Test
    public void graduate_program()
    {
        StudiesPageFunctions.click_on_graduate(driver);
    }

    @Test
    public void lvbs_link()
    {
        StudiesPageFunctions.choose_LVBS(driver);
    }

    @Test
    public void sertification_program_link()
    {
        StudiesPageFunctions.sertificate_programs(driver);
    }

    @Test
    public void language_school_link()
    {
        StudiesPageFunctions.language_school(driver);
    }
}
