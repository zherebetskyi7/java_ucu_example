package tests.main;

import functions.AllInsetsFunctions;
import org.testng.annotations.Test;
import settings.OpenBrowser;

/**
 * Created by yurii on 21.02.17.
 */
public class VerifyAllInsets extends OpenBrowser
{
    @Test
    public void MainPageScienceInset()
    {
        AllInsetsFunctions.click_on_science_inset(driver);
    }
    @Test
    public void MainPageStudyInset()
    {
        AllInsetsFunctions.click_on_study_inset(driver);
    }
    @Test
    public void MainPageLifeCommunity()
    {
        AllInsetsFunctions.click_on_life_in_community(driver);
    }
    @Test
    public void MainPageAboutInset()
    {
        AllInsetsFunctions.click_on_about_inset(driver);
    }
    @Test
    public void MainPageStudents()
    {
        AllInsetsFunctions.click_on_students(driver);
    }
/*    @Test
    public void MainPageForGraduates()
    {
        AllInsetsFunctions.click_on_for_graduates(driver);
    }*/
    @Test
    public void MainPageForTeachers()
    {
        AllInsetsFunctions.click_on_for_teachers(driver);
    }
/*    @Test
    public void MainPageForMedia()
    {
        AllInsetsFunctions.click_on_for_media(driver);
    }*/
    @Test
    public void MainPageOnLogo()
    {
        AllInsetsFunctions.click_on_logo(driver);
    }
    @Test
    public void MainPageOnEntryInset()
    {
        AllInsetsFunctions.click_on_entry_inset(driver);
    }
}
